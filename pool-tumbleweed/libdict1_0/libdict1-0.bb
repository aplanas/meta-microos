SUMMARY = "C library of key-value data structures with an object-oriented interface"
DESCRIPTION = "libdict is a C library that provides the following data structures with \
efficient insert, lookup, and delete routines."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "libdict1_0-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "f76cf2a3dc57c66e312d5a89c4545b19a95e0e528e8a16e89a1e48b8e1ac1997e10813da36947ea49fdd957cf9b679f83d583a7208c7a68094100160df7530f9"

RPROVIDES:${PN} += "libdict.so.1.0 \
libdict1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
