SUMMARY = "Package providing R-core graphics devices in R-grDevices"
DESCRIPTION = "This package provides R-grDevices, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-grDevices-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "7308621e27492b8866048c5a3835412557674bd28e125fa84d5f24c1e481abaa5ae54c9ea0e7b8f1b84f2b04b0e9ea9df040489776be9f3a610c7c9a1a52afe3"

RPROVIDES:${PN} += "R-grDevices"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6 \
libz.so.1"

inherit rpm
