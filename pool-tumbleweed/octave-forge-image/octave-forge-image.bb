SUMMARY = "Image Processing for Octave"
DESCRIPTION = "Functions for processing images. The package also provides functions \
for feature extraction, image statistics, spatial and geometric \
transformations, morphological operations, linear filtering, and much more. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & MIT"

PV = "2.14.0"

RPM_NAME = "octave-forge-image-2.14.0-1.6.aarch64.rpm"
RPM_HASH = "0b3bf869595ffd9d689223d0bdbfeb3338497e9a2f238c22554e1e9ec4c8b05fcf4997885b27ba176ecc9e40251a451aab35dcf67a25a030ade9fdd94541b95e"

RPROVIDES:${PN} += "octave-forge-image \
octave-forge-image(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm
