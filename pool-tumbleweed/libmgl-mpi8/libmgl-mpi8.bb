SUMMARY = "MathGL library with MPI support"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-mpi8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "4ce753dcbc426d110c2e2467dc610c0d1045bd88938ae16e45876178fe08caa714dafb93e47ed9ab32324fc37b2d6fb1dee23e6989cf88313b71a4e25344bc63"

RPROVIDES:${PN} += "libmgl-mpi.so.8 \
libmgl-mpi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libmgl.so.8 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
