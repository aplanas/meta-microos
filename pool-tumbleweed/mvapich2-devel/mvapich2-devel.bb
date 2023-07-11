SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-2 implementation which includes all MPI-1 features.  It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "05487714ed4b5e5599b70a88af2ec30bffd389fc0feaaae11b95e874495ee6c4802114009d270d935ca49854ec779764b190ad72684bae7851501dcbc2af91b7"

RPROVIDES:${PN} += "mvapich2-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
libibumad-devel \
libibverbs-devel \
librdmacm-devel \
mvapich2"

inherit rpm
