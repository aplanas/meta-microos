SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi2-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "8ee042c60cdd5869d0c85b5156f398a3c1a9bef00fc4f16c1a4954977f0a247d0060aaac7d96b32c14a55e01cb996115848596d95845290cb524552a62a2a8e8"

RPROVIDES:${PN} += "python3.10dist-h5py \
python310-h5py-openmpi2 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.20 \
python310-mpi4py \
python310-numpy"

inherit rpm
