SUMMARY = "A GTK 3 based calculator"
DESCRIPTION = "galculator is a GTK 3 based calculator with ordinary notation/reverse \
polish notation (RPN), a formula entry mode, different number bases \
(DEC, HEX, OCT, BIN) and different units of angular measure (DEG, RAD, GRAD). \
It supports quad-precision floating point and 112-bit binary arithmetic."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "galculator-2.1.4-3.15.aarch64.rpm"
RPM_HASH = "645f68cdd7719fafef2d2b8a1ed8537af36f64bfa0979c188e761f0ae78b0ffb00f1dbe39c156fd4448b06990c197a607eec0f8cd780c527bdb3be36f1eaef59"

RPROVIDES:${PN} += "galculator"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
