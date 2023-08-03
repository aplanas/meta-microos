SUMMARY = "Severed fonts for texlive-fge"
DESCRIPTION = "The  separated fonts package for texlive-fge"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.25svn37628"

RPM_NAME = "texlive-fge-fonts-2023.209.1.25svn37628-53.1.noarch.rpm"
RPM_HASH = "1bfe45a98312ca3a83a060f04585915131e9b631c4e0ce971a8266118f288a72ee0ccf9eba805270304cabbbed9812993c233505358ea2f55aaaf55c675c8dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-fgeit10 \
font-fgerm10 \
texlive-fge-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
