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

RPM_NAME = "spack-info-0.20.0-2.1.noarch.rpm"
RPM_HASH = "49f34a2bcfe4f5f9c17b4122ae3ca80bfaec21af97e7b424ab65e2a7e1740e0342aed15f4244f50872baae889829a2cac5b9ef19c2730efbe8d997c00e5e96ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-info"

RDEPENDS:${PN} += "info"

inherit rpm
