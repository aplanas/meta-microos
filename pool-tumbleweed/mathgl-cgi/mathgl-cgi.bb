SUMMARY = "MathGL CGI binary"
DESCRIPTION = "This package contains the MathGL binary for parsing CGI scripts."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-cgi-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "1297be9529ece5f5ce8d2be2c574d1691b0f62832508b1491b627a985ff6e45c4f5c498d2383eb328e2acad4989295af71bdf051b10e4cc7c554cb18fadaa8e0"

RPROVIDES:${PN} += "mathgl-cgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5.so.200 \
libhpdf.so \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
