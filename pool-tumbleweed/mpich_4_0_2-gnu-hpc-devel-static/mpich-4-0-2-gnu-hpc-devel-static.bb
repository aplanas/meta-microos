SUMMARY = "Static libraries for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich_4_0_2-gnu-hpc-devel-static-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "fa24e1675156bd3356c19642128fea7d5c7c7bca55f8e99b3b92c2928dc758edb959a0b434803b431b1b86db2529c3d74acd95123d246c05fadbe275bb44f96a"

RPROVIDES:${PN} += "mpich-4-0-2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-devel"

inherit rpm
