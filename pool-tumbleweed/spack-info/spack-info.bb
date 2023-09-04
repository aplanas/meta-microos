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

RPM_NAME = "spack-info-0.20.0-3.1.noarch.rpm"
RPM_HASH = "422f3e23603361c70917d000d1d8b17298d64116ab2d942ae8e98d3e552252397712038891a79a171dfd2d93af26d93f05db3ae62e22c5ed723c491d37816857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-info"

RDEPENDS:${PN} += "info"

inherit rpm
