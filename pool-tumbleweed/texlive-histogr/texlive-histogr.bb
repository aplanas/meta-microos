SUMMARY = "Draw histograms with the LaTeX picture environment"
DESCRIPTION = "This is a collection pf macros to draw histogram bars inside a \
LaTeX picture-environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-histogr-2023.201.1.01svn15878-53.2.noarch.rpm"
RPM_HASH = "7c0e6ed8439ed875efad49b8d3731571548660dcb946c739cc379d82dba8249a9b9135f5c21c6181dddacaf430ab1bb2e0be792f446c36ca13c601bba0482fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-histogr.sty \
texlive-histogr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
