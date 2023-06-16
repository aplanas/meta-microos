SUMMARY = "Processing an environment's body"
DESCRIPTION = "The package offers tools for collecting and executing an \
environment's body."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29331"

RPM_NAME = "texlive-newenviron-2023.201.1.0svn29331-54.1.noarch.rpm"
RPM_HASH = "fea366fb86dedcc33bdc5c32c5d9b4dae6c981f8f6007dcbe7042f34d542e310622ebdce02b2ae3aa7e05c48006142d3f41f12a28602278743e67cb653a9042c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newenviron.sty \
texlive-newenviron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
