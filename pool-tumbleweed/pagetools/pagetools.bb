SUMMARY = "Automatic de-skew and bounding box determination for scanned page images"
DESCRIPTION = "This program determines the skew angle for text, and works with black/white \
images in TIFF or PBM format. To achieve this, it uses an original \
algorithm based on a fast implementation of the Radon transform. This \
program is part of the Page Layout Detection Tools project, which aims to \
automate the layout detection in scanned page images."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "pagetools-0.1-2.15.aarch64.rpm"
RPM_HASH = "3845f25fe20db7a9e98d916e7989db7fa951e51c82b4e946583ace0ce0d9c65f7d63eeba5cf3768760461e6546232ce7f39d931568672fd47fd1ae077ea9590a"

RPROVIDES:${PN} += "pagetools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnetpbm.so.11 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
