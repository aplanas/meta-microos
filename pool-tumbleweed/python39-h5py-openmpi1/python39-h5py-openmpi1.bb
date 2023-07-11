SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi1-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "805f0a70d444e27ee96064dde65b3dce990a486e0fa983ab0b2b9e2cfd2cfe05566cc6c7c4b194a60f31336cd89497af508cdca1f1a623248493382140b0c6cc"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi1 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.12 \
python39-mpi4py \
python39-numpy"

inherit rpm
