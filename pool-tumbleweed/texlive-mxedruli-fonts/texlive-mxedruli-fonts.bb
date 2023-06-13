SUMMARY = "Severed fonts for texlive-mxedruli"
DESCRIPTION = "The  separated fonts package for texlive-mxedruli"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3csvn30021"

RPM_NAME = "texlive-mxedruli-fonts-2023.201.3.3csvn30021-54.1.noarch.rpm"
RPM_HASH = "3992e589dbb3838a743ce2a05313b6f92c3b1d0f770588a271aac1d5977f1d23c380f3a44afdaeffc1cd69cd2e57d2f4aa2c9606f0b61f7d2eeec82d2092bac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(mxed10) \
font(mxedbf10) \
font(mxedc10) \
font(mxedi10) \
font(xuc10) \
texlive-mxedruli-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
