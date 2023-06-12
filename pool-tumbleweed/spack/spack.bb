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

RPM_NAME = "spack-0.20.0-1.1.noarch.rpm"
RPM_HASH = "03db5ac3d30204509801e4e5ba1e3cf5397545e9e9c9d4a2d7b69dd0170a25a14db915ce9ce9d9223c58b906486aa024b56c6b49b438df6b3769e4ae302f9e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(spack) \
group(spack) \
spack"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
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
