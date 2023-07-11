SUMMARY = "Binary-decimal and decimal-binary routines for IEEE doubles"
DESCRIPTION = "Double-conversion provides binary-decimal and decimal-binary routines \
for IEEE double-precision floating point numbers. The library \
consists of conversion routines that have been extracted from the V8 \
JavaScript engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "libdouble-conversion3-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "a36a541620eb15854b0a8dd115d658d4f9ccc658164598a9128eaad9dcd81ac5de81acedbe84056e043bc1fa7132d4086c98f84cfca0bc16939e89da630a4a75"

RPROVIDES:${PN} += "libdouble-conversion.so.3 \
libdouble-conversion3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
