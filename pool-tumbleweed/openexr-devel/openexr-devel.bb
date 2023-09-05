SUMMARY = "Development files for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains header files."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.1.11"

RPM_NAME = "openexr-devel-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "fcc1b11ce1e5ee5ea01cd6a7837b1caa1673c9fca30f36bb6d157c2a69bc58a6ff695acb2b5eb14d90afa26f5b19a9f4e27f4bbcb5a8ef8e2baf8a88d9a66fac"

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
