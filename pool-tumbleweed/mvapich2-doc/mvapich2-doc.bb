SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-doc-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "77498bdb0498a25504a5601d7c7c0e0170942566735e26874c2d3da46368652373fc5bbe04280dc9d5d5fd503cca4a6a8012d52fcfd1a299bdc67c72b77b8884"

RPROVIDES:${PN} += "mvapich2-doc \
mvapich2-doc(aarch-64)"
RDEPENDS:${PN} += "mvapich2"

inherit rpm
