SUMMARY = "Library for Font Configuration"
DESCRIPTION = "Fontconfig is a library for configuring and customizing font access. It \
contains two essential modules: the configuration module, which builds \
an internal configuration from XML files, and the matching module, \
which accepts font patterns and returns the nearest matching font."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-2.14.2-1.3.aarch64.rpm"
RPM_HASH = "6452f49bfe837318a047b85353b8973379f85671472f8255e1c05d17796fab3633cdc0b18f1cea919a66272c66af6496811dfe716d4133ab212412fa8a246b25"

RPROVIDES:${PN} += "IPA-fonts-config \
config-fontconfig \
fontconfig \
ipa-fonts-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6"

inherit rpm
