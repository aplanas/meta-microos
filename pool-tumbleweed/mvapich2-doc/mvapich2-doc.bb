SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-doc-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "2e0bb95842ae09d164462efafbb59be2281343aa4488a75e7197e717ccc2baf84ad550667087d1b78e441589fb5c0a1ed08f985a5a115b2ffd85917351522f08"

RPROVIDES:${PN} += "mvapich2-doc"

RDEPENDS:${PN} += "mvapich2"

inherit rpm
