SUMMARY = "An optimized BLAS library based on GotoBLAS2, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_openmp0-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "9f2fb535d001ec15391d53bf386932ca0a300662c01fe8829e07d10bff71955d429531a67da076399162c08ebf6444e5b64ecf8b55cc10a7522133aea88f2f52"

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
