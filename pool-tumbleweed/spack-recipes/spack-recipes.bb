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

RPM_NAME = "spack-recipes-0.20.0-1.1.noarch.rpm"
RPM_HASH = "6693db3bf5bd6940c47ad4bad45cc4130df29b3bc456a54e32d3efd86daddca4a545d101c0d55d58b53edd0df7c095c4c4b964a83416ba92afddd0b8194c1080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-recipes"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/sh \
spack"

inherit rpm
