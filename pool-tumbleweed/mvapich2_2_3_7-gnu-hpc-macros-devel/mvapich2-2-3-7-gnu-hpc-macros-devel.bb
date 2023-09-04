SUMMARY = "OSU MVAPICH2 MPI package - HPC build macros"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-macros-devel-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "ec539f79d5e758a9648ba2de5d32014941e51f9479356f6e032e81a379c1b7b5faa31a053e55310fb3b6697ab4c830d1eacf418218ad655af85faf99051a9865"

RPROVIDES:${PN} += "config-mvapich2-2-3-7-gnu-hpc-macros-devel \
mvapich2-2-3-7-gnu-hpc-macros-devel \
mvapich2-hpc-macros-devel \
rpm-macro-hpc-mvapich2-init \
rpm-macro-hpc-mvapich2-requires \
rpm-macro-hpc-mvapich2-requires-devel \
rpm-macro-hpc-setup-mvapich2"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
