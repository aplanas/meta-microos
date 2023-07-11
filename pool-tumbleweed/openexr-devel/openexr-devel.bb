SUMMARY = "Development files for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains header files."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.1.7"

RPM_NAME = "openexr-devel-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "37317ecbcd322b5a228d6f53cdcd251c6180bb0ba006d968dc9eb3bf0c3c7cdbb1e463d83bbae90927069caae03f944580fa202846f12d760f77629f5ffc9f86"

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
