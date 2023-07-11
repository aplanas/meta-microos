SUMMARY = "Liquid Rescale seam-carving library"
DESCRIPTION = "The Liquid Rescale (lqr) library provides a C/C++ API for performing \
non-uniform resizing of images by the seam-carving technique."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "liblqr-1-0-0.4.2-7.4.aarch64.rpm"
RPM_HASH = "45e825a8900d2837514b6d657b627948124298c0d6ae92e67b3400ae9492d841e50b5615ab33f39a76b5a2e8d09300970dcd7525838f3419203e3c9a4a7e664a"

RPROVIDES:${PN} += "liblqr-1-0 \
liblqr-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
