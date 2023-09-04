SUMMARY = "Plymouth 'space-flares' plugin"
DESCRIPTION = "This package contains the 'space-flares' boot splash plugin for \
Plymouth. It features a corner image with animated flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-space-flares-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "98442ca87fa2ee4491ac046a33dbd50959b63aee3c992efdef9a380c99c039f053a25acf063694511b4d127e307a922b30e80c2b2d08c7b725f7d10d21270377"

RPROVIDES:${PN} += "plymouth-plugin-space-flares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics.so.5 \
libply-splash-graphics5 \
libply.so.5 \
libply5 \
plymouth-plugin-label"

inherit rpm
