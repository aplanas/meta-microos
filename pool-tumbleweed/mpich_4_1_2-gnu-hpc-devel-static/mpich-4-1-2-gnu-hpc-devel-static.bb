SUMMARY = "Static libraries for MPICH HPC version 4.1.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich_4_1_2-gnu-hpc-devel-static-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "2ac029ddfea5ace4b1fe0f3ff3931ab8297123a14627db6d9c24df61b15007b1c0db12767e3a8c0020ce55b85abe387fe5523c9dea6fb42dab57e595dde0df91"

RPROVIDES:${PN} += "mpich-4-1-2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-4-1-2-gnu-hpc-devel"

inherit rpm
