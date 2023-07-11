SUMMARY = "MathGL CGI binary"
DESCRIPTION = "This package contains the MathGL binary for parsing CGI scripts."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-cgi-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "631f17167286f033d8813e23f9b64e638124618e80f797eb56d82cce0d81ab49ba455d1bc2d5bdf84d031a9328495f2bf3c129f5364e042eb3f149ef97f46bf5"

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
libhpdf.so.2 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
