SUMMARY = "MathGL CGI binary"
DESCRIPTION = "This package contains the MathGL binary for parsing CGI scripts."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-cgi-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "1297be9529ece5f5ce8d2be2c574d1691b0f62832508b1491b627a985ff6e45c4f5c498d2383eb328e2acad4989295af71bdf051b10e4cc7c554cb18fadaa8e0"

RPROVIDES:${PN} += "mathgl-cgi \
mathgl-cgi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgif.so.7()(64bit) \
libgomp.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
libhpdf.so()(64bit) \
libjpeg.so.8()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
