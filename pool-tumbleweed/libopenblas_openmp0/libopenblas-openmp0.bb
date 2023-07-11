SUMMARY = "An optimized BLAS library based on GotoBLAS2, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_openmp0-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "25a90b0878afb79a4cc8aaeccb852adb53d967a06ee2d2921c53e77b4b829c864d3b674a96c76e03863c085b7be44a7a3f7f617cbf084a22b8a3def9f3167f6d"

RPROVIDES:${PN} += "libopenblas-openmp0 \
libopenblas.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libm.so.6 \
update-alternatives"

inherit rpm
