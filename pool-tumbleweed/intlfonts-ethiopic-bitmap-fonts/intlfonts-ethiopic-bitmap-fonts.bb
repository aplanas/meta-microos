SUMMARY = "Ethiopic Fonts for the X Window System"
DESCRIPTION = "Ethiopic fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-ethiopic-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "86e70e77c94ac2da221970c1bf9231606133fe50a783c1142854c203ee6d42d585fb45735e2bad8ac365203a9a49493646fbdea02fb315b1491f7284b8194757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntethi \
intlfonts-ethiopic-bitmap-fonts \
locale-xorg-x11-am"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
