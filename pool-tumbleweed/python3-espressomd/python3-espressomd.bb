SUMMARY = "Parallel simulation software for soft matter research"
DESCRIPTION = "ESPResSo is a highly versatile software package for performing and analyzing \
scientific Molecular Dynamics many-particle simulations of coarse-grained \
atomistic or bead-spring models as they are used in soft-matter research in \
physics, chemistry and molecular biology. It can be used to simulate systems \
such as polymers, liquid crystals, colloids, ferrofluids and biological \
systems, for example DNA and lipid membranes."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "python3-espressomd-4.2.1-2.2.aarch64.rpm"
RPM_HASH = "8641fb11529fb480d883b2f45be903619f6d8de26319bf45bf071a1f7b3d706132f439115a7d24aa1811627ba658c3fadc26f02f05675a3bc7a4ebab0dc11a08"

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
