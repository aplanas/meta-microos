SUMMARY = "Info Page for Spack - Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the info page."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "spack-info-0.20.0-1.1.noarch.rpm"
RPM_HASH = "1d613fb47ba7a82d02b50382af1560bf9f8086baa9c21b9cfe1815b72ea95ff90dfc2de882b2430ef9228876d7796d3d66b118903024d454f82a0ad9a1c73b48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-info"

RDEPENDS:${PN} += "info"

inherit rpm
