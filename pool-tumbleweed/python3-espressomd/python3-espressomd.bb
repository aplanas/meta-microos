SUMMARY = "Parallel simulation software for soft matter research"
DESCRIPTION = "ESPResSo is a highly versatile software package for performing and analyzing \
scientific Molecular Dynamics many-particle simulations of coarse-grained \
atomistic or bead-spring models as they are used in soft-matter research in \
physics, chemistry and molecular biology. It can be used to simulate systems \
such as polymers, liquid crystals, colloids, ferrofluids and biological \
systems, for example DNA and lipid membranes."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "python3-espressomd-4.2.1-2.1.aarch64.rpm"
RPM_HASH = "9df9a757c67d7b75d85ab11d4a72f836fd9c854f954d7cc8e11f0882325b7ad82b475fcaec5e1a8dee08b07f230f73c6f13185c5c5a0f0178b06c4cf42bdab64"

RPROVIDES:${PN} += "libEspresso4 \
python3-espressomd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-mpi.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5-openmpi4 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
python-abi \
python3-h5py \
python3-numpy"

inherit rpm
