SUMMARY = "Development files for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains header files."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.1.9"

RPM_NAME = "openexr-devel-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "f6b362cfa2f25fb040dbee9ef669af747f48573fa902c3dc3ed6a5175f948168715fe018aeb48aec7a5ecd0bab08077b3a6c197d40e3f6c60d22e295ccc95631"

RPROVIDES:${PN} += "OpenEXR-devel \
cmake-OpenEXR \
ilmbase-devel \
libopenexr-devel \
openexr-devel \
pkgconfig-OpenEXR"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Imath-devel \
libOpenEXR-3-1-30 \
libOpenEXRCore-3-1-30 \
libOpenEXRUtil-3-1-30 \
pkgconfig \
pkgconfig-Imath \
pkgconfig-zlib"

inherit rpm
