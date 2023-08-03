SUMMARY = "A PSTricks related package which draws an antiprism"
DESCRIPTION = "pst-antiprism is a PSTricks related package which draws an \
antiprism, which is a semiregular polyhedron constructed with \
2-gons and triangles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn46643"

RPM_NAME = "texlive-pst-antiprism-2023.209.0.0.02svn46643-53.1.noarch.rpm"
RPM_HASH = "ac47cabcc4f78c36c63c495a8728fd4737e25291540538c4e51f741e39322187931e1301023b9675c323143781ec1f1985b60b934079e8a42a379f5090e75726"
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
