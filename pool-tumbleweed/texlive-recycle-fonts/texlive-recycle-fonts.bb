SUMMARY = "Severed fonts for texlive-recycle"
DESCRIPTION = "The  separated fonts package for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-recycle-fonts-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "35a594391d5dde212fcae376d3cc98f7e0cbb523cc64ce20d0ffaee8c3364e032684c351a47d0ae8a4b504f73720ee30cb43bb362297b3a03f0e64c8ca5add9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-recycle \
texlive-recycle-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
