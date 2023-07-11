SUMMARY = "Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package provides a module file that must be loaded to use spack."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "spack-0.20.0-2.1.noarch.rpm"
RPM_HASH = "016774032f37ada76e4732d487dfec895fc47b70e6ebfd392355689419f7a46664402e768889a96fdee571b05679c54904593c590c33f2e9963ec21540a8397b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-spack \
group-spack \
spack"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
awk \
bzip2 \
coreutils \
curl \
gcc-c++ \
gcc-fortran \
git \
gpg2 \
gzip \
libbz2-devel \
lua-lmod \
make \
patch \
polkit \
python3-clingo \
spack-recipes \
sudo \
tar \
unzip \
xz"

inherit rpm
