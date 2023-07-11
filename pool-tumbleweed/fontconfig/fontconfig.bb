SUMMARY = "Library for Font Configuration"
DESCRIPTION = "Fontconfig is a library for configuring and customizing font access. It \
contains two essential modules: the configuration module, which builds \
an internal configuration from XML files, and the matching module, \
which accepts font patterns and returns the nearest matching font."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-2.14.2-1.4.aarch64.rpm"
RPM_HASH = "91a0b7f8c91a44886a7be4be3d920ad85df36ecb75b2bb29a04d1b3c92b6fa26c43ca711087c22cb3163b361692148ebdc20f514b221b6e068260be5815a3be0"

RPROVIDES:${PN} += "IPA-fonts-config \
config-fontconfig \
fontconfig \
ipa-fonts-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6"

inherit rpm
