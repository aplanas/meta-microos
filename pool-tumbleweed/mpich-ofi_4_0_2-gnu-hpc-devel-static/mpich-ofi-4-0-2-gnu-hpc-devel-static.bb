SUMMARY = "Static libraries for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-devel-static-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "84c711cc29388c06527bf391a1170e9cab993c38554c17ef3a5cb7db5271efcb7cb7364ae08b68477bdf90b915373147f4254d5dc0cdc1d29ba916e804ef5dd3"

RPROVIDES:${PN} += "mpich-ofi-4-0-2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-ofi-4-0-2-gnu-hpc-devel"

inherit rpm
