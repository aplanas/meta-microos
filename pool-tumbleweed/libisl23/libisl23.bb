SUMMARY = "The ISL shared library"
DESCRIPTION = "The shared library for the ISL. \
 \
ISL is a library for manipulating sets and relations of integer points \
bounded by linear constraints."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "libisl23-0.26-1.3.aarch64.rpm"
RPM_HASH = "0115fb38812610e9146aa7259cec7bd0e23fc3551f635b6c7d74385751f2cbd57982a449d23a1ab11a0017c1cd65b5e58f1abf7e8cf0fb091ec45636fa919f1a"

RPROVIDES:${PN} += "libisl.so.23 \
libisl23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
