SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-static-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "f15ce892eaca3060de4846970a8f3e277f5d89a3531b8363841469d262a938d010ac3f1e4f4705560fd966ee8a89a9b7844ca6cf994581518db1b2b1aa3fa7cb"

RPROVIDES:${PN} += "mvapich2-devel-static"

RDEPENDS:${PN} += "mvapich2-devel"

inherit rpm
