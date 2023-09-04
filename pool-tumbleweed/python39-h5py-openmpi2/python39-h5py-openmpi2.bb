SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-h5py-openmpi2-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "c9b4a870086f6858045eb0e3e8c841332f1e43d350ff9fd9a1789249102ff4e5e3deefa459b5048718429542ea862640521e27374e9d16285116f023e3abc331"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi2 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.20 \
python39-mpi4py \
python39-numpy"

inherit rpm
