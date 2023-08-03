SUMMARY = "Curves with continuous colours"
DESCRIPTION = "This is a PSTricks-related package. It can plot lines and/or \
curves with continuous colours. Only colours defined in the hsb \
model are supported"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn61322"

RPM_NAME = "texlive-pst-hsb-2023.209.0.0.02svn61322-53.1.noarch.rpm"
RPM_HASH = "4e87b9ee67dc2b1973ddabe4de82f8821c785c5986ed69fe02e8614ec46f870ee0d313686134c63d6f222b6eaa108299d5aa5653cb41f96da3e8b66c6515854d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-hsb.sty \
tex-pst-hsb.tex \
texlive-pst-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
