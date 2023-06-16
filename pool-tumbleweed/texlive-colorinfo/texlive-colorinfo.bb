SUMMARY = "Retrieve colour model and values for defined colours"
DESCRIPTION = "The colorinfo package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3csvn15878"

RPM_NAME = "texlive-colorinfo-2023.201.0.0.3csvn15878-53.1.noarch.rpm"
RPM_HASH = "65f1b8437055bb3ac5a266edc540011b29806cb725d2ed7f328e8f6a66dbbd0b67544b46026fc784bc978297520313b46373a0668790e65586802c627e5de2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorinfo.sty \
texlive-colorinfo"

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
