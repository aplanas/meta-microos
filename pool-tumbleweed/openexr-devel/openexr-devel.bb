SUMMARY = "Development files for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains header files."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.1.7"

RPM_NAME = "openexr-devel-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "bdb89c865a5d1ddba3c4a035c250ca88303877b82245b8ff9bd30b4ea9c5e8abd08b21f3312d5969d502d0b26c2c0104b4800d9477c32720dfe79b3dd6072159"

RPROVIDES:${PN} += "OpenEXR-devel \
cmake(OpenEXR) \
ilmbase-devel \
libopenexr-devel \
openexr-devel \
openexr-devel(aarch-64) \
pkgconfig(OpenEXR)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Imath-devel \
libOpenEXR-3_1-30 \
libOpenEXRCore-3_1-30 \
libOpenEXRUtil-3_1-30 \
pkgconfig \
pkgconfig(Imath) \
pkgconfig(zlib)"

inherit rpm
