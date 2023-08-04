SUMMARY = "Static libraries for MPICH HPC version 4.1.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi_4_1_2-gnu-hpc-devel-static-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "d679c33758a86e34cc3b4d1fc3e565e069d5b170571be67165cee9a0a017c9909202bfed0df9a0a444268a31e63fba3a3355aaffb3e7afdf7713be868b8ecabe"

RPROVIDES:${PN} += "mpich-ofi-4-1-2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-ofi-4-1-2-gnu-hpc-devel"

inherit rpm
