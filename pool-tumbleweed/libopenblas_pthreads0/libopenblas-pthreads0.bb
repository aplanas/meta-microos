SUMMARY = "An optimized BLAS library based on GotoBLAS2, pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_pthreads0-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "70ebee8bca45a5f5953355cdcec5b53577ebd12eb2467dbf33a64a9fcdf269094096dd5b24dd693b568a0f1a64ec2663b527cb76ea4bb473f76b303744afbe4f"

RPROVIDES:${PN} += "libopenblas-pthreads0 \
libopenblas.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
update-alternatives"

inherit rpm
