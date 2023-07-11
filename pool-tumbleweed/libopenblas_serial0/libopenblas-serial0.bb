SUMMARY = "An optimized BLAS library based on GotoBLAS2, serial version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_serial0-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "490a3d319e68df6ee7ab3ecffccccb440b6050d51baea7de088a80b3f0de9405a453cf54d77cb6e1f49c6e919d4b7e9230d92cb27159259bfa3ae574a3ae9091"

RPROVIDES:${PN} += "libopenblas-serial0 \
libopenblas.so.0 \
libopenblas0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
update-alternatives"

inherit rpm
