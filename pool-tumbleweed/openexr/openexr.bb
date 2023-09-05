SUMMARY = "Utilities for working with HDR images in OpenEXR format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. This package \
contains a set of utilities to work with this format. \
 \
* exrheader, a utility for dumping header information \
* exrstdattr, a utility for modifying OpenEXR standard attributes \
* exrmaketiled, for generating tiled and rip/mipmapped images \
* exrenvmap, for creating OpenEXR environment maps \
* exrmakepreview, for creating preview images for OpenEXR files \
* exr2aces, converter to ACES format \
* exrmultiview, combine two or more images into one multi-view"
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "openexr-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "bb62c7176452e7d65cd53b676c7f37eb1eaa12a79bd2fd188e2849c5b20522e849cb33b79b9a5e383253bbe52233a0ae3af36315ec82ffad38a51f869766f5ca"

RPROVIDES:${PN} += "OpenEXR \
openexr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libOpenEXRCore-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
