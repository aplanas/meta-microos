SUMMARY = "Severed fonts for texlive-fge"
DESCRIPTION = "The  separated fonts package for texlive-fge"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn37628"

RPM_NAME = "texlive-fge-fonts-2023.201.1.25svn37628-52.1.noarch.rpm"
RPM_HASH = "e5ff39c1637a5a54633ec621df5410a7c365126439efad4bec6babc74a98be4ca1559d9deaa26d0fc0f73996d5f576c110ac216c56001fb87947c3f8731a40b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-fgeit10 \
font-fgerm10 \
texlive-fge-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
