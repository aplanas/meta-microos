SUMMARY = "Vector/OTF remakes of Xorg fonts"
DESCRIPTION = "Vector remakes of the Xorg 'Misc Fixed' fonts (8x13, 9x15, 10x20) and \
'Sony Fixed' (12x24)."
LICENSE = "CC-BY-SA-4.0"

PV = "7.6.1"

RPM_NAME = "consoleet-xorg-fonts-7.6.1-1.1.noarch.rpm"
RPM_HASH = "3e887243d1656b24362f154a94abbcac41880ee99d5603f237349a1699ad27a8223932fa20646829e0f2197b84f46df878bef086bafb8ea6d717b4fee52bcfd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-xorg-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
