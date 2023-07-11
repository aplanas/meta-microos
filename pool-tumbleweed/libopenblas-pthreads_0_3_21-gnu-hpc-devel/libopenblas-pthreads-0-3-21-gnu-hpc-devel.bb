SUMMARY = "Development libraries for OpenBLAS, gnu-hpc-pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads_0_3_21-gnu-hpc-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "5417e707a513278dd3ea371b9f38033138493726902b473d7deee6f5f635608e16d72c47e8e53d693a0148bbe8e85211510bc920e537b631879ea804b9b06f84"

RPROVIDES:${PN} += "libopenblas-pthreads-0-3-21-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-pthreads-0-3-21-gnu-hpc"

inherit rpm
