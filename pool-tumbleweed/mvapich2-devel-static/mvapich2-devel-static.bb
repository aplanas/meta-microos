SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-static-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "d04c91ecf4dbea7519a35d1642b2eca70db3dbebe7c1983ab7e72e47d7a34835443cdc53b8f2bc06ea931b881240df362fbf8ba859c768eab31e91efe710a13c"

RPROVIDES:${PN} += "mvapich2-devel-static"

RDEPENDS:${PN} += "mvapich2-devel"

inherit rpm
