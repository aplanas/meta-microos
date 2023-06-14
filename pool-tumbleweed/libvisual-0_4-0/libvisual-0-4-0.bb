SUMMARY = "Sound Visualization library"
DESCRIPTION = "Libvisual is a library that acts as a middle layer between applications \
that need audio visualization and audio visualization plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libvisual-0_4-0-0.4.0-204.3.aarch64.rpm"
RPM_HASH = "c52833b83445fcf7f8fe45d4333643722e783eefa72c496f5c1c8e035040b8e440de6aa4b6298880843b332123b376829aa82da43d83cb770da66f4501a6f829"

RPROVIDES:${PN} += "libvisual-0-4-0 \
libvisual-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
