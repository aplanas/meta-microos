SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-devel-static-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "b561daa263b00316d93d9e6ddd94ef1913117e9102868e882ea275208f74163ae95e86ee1b1a1d79eedc48148ed609eb6b9947b8673bf1c8d6aa4b5af2cf7bc6"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
