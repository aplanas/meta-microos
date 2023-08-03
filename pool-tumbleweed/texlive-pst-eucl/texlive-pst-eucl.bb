SUMMARY = "Euclidian geometry with PSTricks"
DESCRIPTION = "The package allows the drawing of Euclidean geometric figures \
using TeX pstricks macros for specifying mathematical \
constraints. It is thus possible to build point using common \
transformations or intersections. The use of coordinates is \
limited to points which controlled the figure."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.75svn56474"

RPM_NAME = "texlive-pst-eucl-2023.209.1.75svn56474-53.1.noarch.rpm"
RPM_HASH = "a856e3b16f53b2b0982ecf40531e98083c645d59bcf2afe32d0cc3ed2c3f4c23a0459a51d58ba0d0405eeea8d930c0b94d3191b39b95c677df6607f3e60a73d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-eucl.sty \
tex-pst-eucl.tex \
texlive-pst-eucl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-calculate.sty \
tex-pst-node.sty \
tex-pst-tools.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
