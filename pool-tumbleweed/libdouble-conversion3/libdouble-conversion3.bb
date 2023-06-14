SUMMARY = "Binary-decimal and decimal-binary routines for IEEE doubles"
DESCRIPTION = "Double-conversion provides binary-decimal and decimal-binary routines \
for IEEE double-precision floating point numbers. The library \
consists of conversion routines that have been extracted from the V8 \
JavaScript engine."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "libdouble-conversion3-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "7732782d94042d04a46f6eadfe72eed2fa4d098e914875029df902bddb80185a43be0ed8de84514bd409c249a6ac2c2f75385d350ff28e36c3c07b1478cef66d"

RPROVIDES:${PN} += "libdouble-conversion.so.3 \
libdouble-conversion3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
