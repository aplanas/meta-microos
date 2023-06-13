SUMMARY = "The ISL shared library"
DESCRIPTION = "The shared library for the ISL. \
 \
ISL is a library for manipulating sets and relations of integer points \
bounded by linear constraints."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "libisl23-0.26-1.1.aarch64.rpm"
RPM_HASH = "5eea77c44c9b4f93e3ba3b50f11629b095a5182e1fec09a15c92ffe0ed8d749bd535be03e20e850ba62cf66dd7d40fa6b5958d5b5b6ed1c208b5a6e0beff5d25"

RPROVIDES:${PN} += "libisl.so.23()(64bit) \
libisl23 \
libisl23(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
