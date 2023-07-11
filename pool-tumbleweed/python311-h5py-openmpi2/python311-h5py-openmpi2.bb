SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi2-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "d2d8472484cf18c12b0b16c7b8cb48aeefa3730a30df1f98a4f6351ec06de7260da91c02a9e951d6314280d99212f6cd4d02453e5f116fc84bd0e6fcebcaddb1"

RPROVIDES:${PN} += "python3-h5py-openmpi2 \
python3.11dist-h5py \
python311-h5py-openmpi2 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.20 \
python311-mpi4py \
python311-numpy"

inherit rpm
