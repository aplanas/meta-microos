SUMMARY = "PLplot csirocsa component"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's csirocsa."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libcsirocsa0-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "bfde684f9b34e5cc7c756546426b1e3c1145bb531b3081ffbd3d03ca35bfa9431e0dff1e34e921ccc1e861b580b70ebc59d52d508929ae50078b49890f02469e"

RPROVIDES:${PN} += "libcsirocsa.so.0 \
libcsirocsa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
