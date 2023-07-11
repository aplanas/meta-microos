SUMMARY = "Image Processing for Octave"
DESCRIPTION = "Functions for processing images. The package also provides functions \
for feature extraction, image statistics, spatial and geometric \
transformations, morphological operations, linear filtering, and much more. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & MIT"

PV = "2.14.0"

RPM_NAME = "octave-forge-image-2.14.0-1.7.aarch64.rpm"
RPM_HASH = "d63ece63c75f5f7c49616c68b57d83df1bc456d8355dfb39025628c2faca7726b01ab14f9e260e9799e5b5d059e6b1a5ea6308d3a820a6b50c9b7f717f89b131"

RPROVIDES:${PN} += "octave-forge-image"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
