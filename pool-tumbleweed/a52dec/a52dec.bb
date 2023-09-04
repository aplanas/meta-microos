SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "a52dec-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "a370be5c74fc0acd80eb1323c3e05bea254078b0b27be0c983abcc79293cd000b2befd07dd0283b9f761d42fa745848ebdd0de4398f41ba9a1a8aefd7a2d10c4"

RPROVIDES:${PN} += "a52 \
a52dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liba52-0 \
liba52.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
