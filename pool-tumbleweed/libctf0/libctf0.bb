SUMMARY = "Compact C Type Format library (runtime, BFD dependency)"
DESCRIPTION = "This package includes the libctf shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "libctf0-2.40-5.1.aarch64.rpm"
RPM_HASH = "c441ef88ea7d46a61118770f0589a87e3fda8849fd394191f82679c514c1168aea91e26b6cdfb86528b5d6982c482a11f533401cf9d05a613dfc77628d0ebacc"

RPROVIDES:${PN} += "libctf.so.0 \
libctf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfd-2.40.0.20230412-5.so \
libc.so.6 \
libz.so.1"

inherit rpm
