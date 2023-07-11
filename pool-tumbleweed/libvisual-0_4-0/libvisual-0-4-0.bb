SUMMARY = "Sound Visualization library"
DESCRIPTION = "Libvisual is a library that acts as a middle layer between applications \
that need audio visualization and audio visualization plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libvisual-0_4-0-0.4.0-204.4.aarch64.rpm"
RPM_HASH = "cc94515c50f331831e0401e9b317a22af92761f4ca1a0b771de0b262399798c8db8aa276f0f52b50eefe396c89c916d3c9898d5d0d5f2ece89cf0f092089aeba"

RPROVIDES:${PN} += "libvisual-0-4-0 \
libvisual-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
