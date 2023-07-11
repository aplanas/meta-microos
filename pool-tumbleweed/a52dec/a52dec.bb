SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5+svn613"

RPM_NAME = "a52dec-0.7.5+svn613-3.17.aarch64.rpm"
RPM_HASH = "58798a18df28d03498ffe082dec7d23226a0430a7eb5fb783c38a582b27964c5b7f9ca148271e405857c9542aa1430ea4185881bcbcfc75ee418c54ff56f10a1"

RPROVIDES:${PN} += "a52 \
a52dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liba52-0 \
liba52.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
