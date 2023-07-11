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

PV = "3.1.7"

RPM_NAME = "openexr-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "df878f56bd2ffcc31624181d7c63c88ea4fbb584f216d77fe1aa0fd671916f685db9e45ec10d99b3beab9abc5e374a0c8cf75229541a61f42dca53366251f3c4"

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
