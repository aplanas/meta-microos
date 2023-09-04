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

RPM_NAME = "spack-recipes-0.20.0-3.1.noarch.rpm"
RPM_HASH = "4efcefe17009aa49566eb43f867a49b89d08caec07f825a359a6d8d9b0bb1820e433e3519b6d21658e6bf1f0299d7cf2f4e2be8596f92d98bf092edd6cb5e573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-recipes"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
spack"

inherit rpm
