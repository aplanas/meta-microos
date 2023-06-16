SUMMARY = "A PSTricks related package which draws an antiprism"
DESCRIPTION = "pst-antiprism is a PSTricks related package which draws an \
antiprism, which is a semiregular polyhedron constructed with \
2-gons and triangles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn46643"

RPM_NAME = "texlive-pst-antiprism-2023.201.0.0.02svn46643-52.1.noarch.rpm"
RPM_HASH = "30c6df61b6d717ba71873a114b28bbc82571ece53187e280711bad0583a17958dd6306dfde7db72bdad2d89306cbb5280b6b2ee1ff5027631092cd52e2f32420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-antiprism.sty \
tex-pst-antiprism.tex \
texlive-pst-antiprism"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-solides3d.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
