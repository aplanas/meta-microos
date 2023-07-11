SUMMARY = "PLplot functions for scientific plotting with C"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's C binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplot17-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "d0b4a8afb16aab9b5540f3d29af497e9eeb1743827372bd93be78f7153cb1e681afef997ebff13711216e8698b891539e58b1a43744d67ca59e785d0984e0141"

RPROVIDES:${PN} += "libplplot.so.17 \
libplplot17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcsirocsa.so.0 \
libcsironn.so.0 \
libltdl.so.7 \
libm.so.6 \
libqsastime.so.0 \
libshp.so.2"

inherit rpm
