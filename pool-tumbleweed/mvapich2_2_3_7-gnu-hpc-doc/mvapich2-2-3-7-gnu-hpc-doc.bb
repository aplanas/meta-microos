SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-doc-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "0665a61dbdf6d3b28f8a92196b324c5ca6292c995c8f4a512a33435affb9fe44cd458c432fe0d56bd5fb170cac85524e8fb8a928508561175a7b81d3ac8b3983"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc-doc"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc"

inherit rpm
