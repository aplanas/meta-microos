SUMMARY = "A GTK 3 based calculator"
DESCRIPTION = "galculator is a GTK 3 based calculator with ordinary notation/reverse \
polish notation (RPN), a formula entry mode, different number bases \
(DEC, HEX, OCT, BIN) and different units of angular measure (DEG, RAD, GRAD). \
It supports quad-precision floating point and 112-bit binary arithmetic."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "galculator-2.1.4-3.14.aarch64.rpm"
RPM_HASH = "620aba3477eeb503cfb8bb92817cdcc14c1554ea4e903ba2b28088dd060dc6b789641380dd3c37ccf9ee980e9fdfdd77148435b405b49ed0085482fc54258cdb"

RPROVIDES:${PN} += "galculator"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
