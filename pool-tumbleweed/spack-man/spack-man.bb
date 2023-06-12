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

RPM_NAME = "spack-man-0.20.0-1.1.noarch.rpm"
RPM_HASH = "89c90975fb9a364910e8ad8bff77e8b8cac745177aead619f6407a97d4ff18fa95f0a70789c8057f2ceeeb2fffe5daf55ad29f63135d06cdea31480b6672c2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-man"
RDEPENDS:${PN} += "man"

inherit rpm
