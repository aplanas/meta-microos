SUMMARY = "Package providing R-core graphics devices in R-grDevices"
DESCRIPTION = "This package provides R-grDevices, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-grDevices-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "596aa360002dc45892243a84a7b4a65cf61beb080970bce0c0532fe33473d07ac64081fe8226a4542dcc712e6114bcb4c492e0771f179b2ca1f145da66fcb8cc"

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
