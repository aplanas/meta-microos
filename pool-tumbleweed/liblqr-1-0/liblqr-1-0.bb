SUMMARY = "Liquid Rescale seam-carving library"
DESCRIPTION = "The Liquid Rescale (lqr) library provides a C/C++ API for performing \
non-uniform resizing of images by the seam-carving technique."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "liblqr-1-0-0.4.2-7.3.aarch64.rpm"
RPM_HASH = "cc22f1d6721b87f9bd9319405cc434be8f39814b3250bf8fd2da2973c5633e4ef053c0f0445df1c7b6c438b44e7e36f43e98ec4926a162cf1e6fb841a69d961d"

RPROVIDES:${PN} += "liblqr-1-0 \
liblqr-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
