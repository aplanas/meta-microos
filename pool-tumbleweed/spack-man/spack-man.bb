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

RPM_NAME = "spack-man-0.20.0-3.1.noarch.rpm"
RPM_HASH = "da72804a0ff168802e2d2ebac04e0f7c11782013fd9bcf138e5a0d30fef7d3bc1a4d4c53ef46abc1bc035f86c96c5aabb00f158ace58d5028a24ca8abd2dd469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-man"

RDEPENDS:${PN} += "man"

inherit rpm
