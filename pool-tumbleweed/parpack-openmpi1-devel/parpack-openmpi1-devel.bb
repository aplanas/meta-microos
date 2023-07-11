SUMMARY = "Development files for parpack-openmpi1"
DESCRIPTION = "The parpack-openmpi1-devel package contains libraries and header files for \
developing applications that use parpack-openmpi1."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi1-devel-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "bc450e91a8feb1f3fd503d35249e489b9394cbe2bedb04a218537b2c2be6d2dc4ae004392c7091f13503e8e724cfa57b73ad0f4439807a7b29826ce04db20218"

RPROVIDES:${PN} += "parpack-openmpi-devel \
parpack-openmpi1-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi1 \
openmpi1-devel"

inherit rpm
