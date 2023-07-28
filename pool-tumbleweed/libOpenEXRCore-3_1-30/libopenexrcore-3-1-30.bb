SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRCore"
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "libOpenEXRCore-3_1-30-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "043b9ae804b755088782b26a362d612559d00ccb0d0cb5f4aca3aee49c078ca85a931d699497da715f3b8c1264a28deb45894626aefc4f17711a5897c30d1ae0"

RPROVIDES:${PN} += "libOpenEXRCore-3-1-30 \
libOpenEXRCore-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
