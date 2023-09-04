SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "5d322096a9ad9274465f15946f54075027929e918d450586032c14c51f76054b1ec8a907e51e285d9d98a11f1fa852aac5ae3b518af226ad978dfc3d14bf8292"

RPROVIDES:${PN} += "mvapich2-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
libibumad-devel \
libibverbs-devel \
librdmacm-devel \
mvapich2"

inherit rpm
