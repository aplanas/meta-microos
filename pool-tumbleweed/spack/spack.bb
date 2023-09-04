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

RPM_NAME = "spack-0.20.0-3.1.noarch.rpm"
RPM_HASH = "820e956faf41a67ddf30544af87322ce574b5d3b605eb1bc55bf6cc12154cc3bcb6eda339c3c8e4cdb16e20e73a145d96bba1e842ab6e7a879a4d2109bd3fc39"
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
