SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi1-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "d93c684b245992ac4dfd82db87c4637043a22d20238f98644c182ced3f962687736cd1248a175d39de8a281eea651465c62f2d1bdb9dc54e934c818ce56b787a"

RPROVIDES:${PN} += "python3-h5py-openmpi1 \
python3.11dist-h5py \
python311-h5py-openmpi1 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.12 \
python311-mpi4py \
python311-numpy"

inherit rpm
