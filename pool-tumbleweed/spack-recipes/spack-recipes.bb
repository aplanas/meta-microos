SUMMARY = "Spack built-in package recipes"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the built-in package recipes."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "spack-recipes-0.20.0-2.1.noarch.rpm"
RPM_HASH = "14ebeabc8d36373ff6e00253bba98c2a6704c230494c558da7fe4cb7d23a6fcbc41bf23307c2f6f57ab3b646b0c416261ef9b9e2eaab7536199948e4461220f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-recipes"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
spack"

inherit rpm
