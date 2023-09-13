SUMMARY = "Astrometric Solver runtime library"
DESCRIPTION = "An Astrometric Plate Solver for Mac, Linux, and Windows, \
built on Astrometry.net and SEP (sextractor), runtime library."
LICENSE = "GPL-3.0-or-later"

PV = "2.5"

RPM_NAME = "libstellarsolver2-2.5-1.1.aarch64.rpm"
RPM_HASH = "87e584e401453ca89501749b5ad6a05608826ea43bd6ad03805004d05bf8e38d5cb923597165c83e68eeb767ccaaf41b1bf363ebed68a975573d54950d687c7f"

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
