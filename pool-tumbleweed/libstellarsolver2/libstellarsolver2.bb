SUMMARY = "Astrometric Solver runtime library"
DESCRIPTION = "An Astrometric Plate Solver for Mac, Linux, and Windows, \
built on Astrometry.net and SEP (sextractor), runtime library."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "libstellarsolver2-2.4-2.4.aarch64.rpm"
RPM_HASH = "ef97570c46f64e12e0818e087dcc5bd9e19cff8dd45975f949db52a601abaef848496f09bb19ede8e7dd61b6642e94969536004ee6085845becf48f5d4f72a4b"

RPROVIDES:${PN} += "libstellarsolver.so.2 \
libstellarsolver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwcs.so.7"

inherit rpm
