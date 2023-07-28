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

PV = "3.1.9"

RPM_NAME = "openexr-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "8012cce93c9f51537580d5f7573ee93c76e0912910cad72f07ccf3fff09bf1883018a403e0f03107831fef225de7f741c7c43011a340ad4ca74b9f9a6a62fba7"

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
