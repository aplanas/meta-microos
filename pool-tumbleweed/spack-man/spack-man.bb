SUMMARY = "Man Page for Spack - Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the man page."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "spack-man-0.20.0-2.1.noarch.rpm"
RPM_HASH = "2c8a64aef1d42fd0f08694bb61765d4a0e48bd5d6382fddbb7ea9930c256d186cac35a47cc633318bfdfe668134e1b89eeb0acafc4585df195c79d5cba295fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-man"

RDEPENDS:${PN} += "man"

inherit rpm
