SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-h5py-openmpi1-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "953945e09292c0a656cf10c114ba6164de712cd87ca317b44bd194c266a26914324d40afb779ba638f90bba6e7aff1942e5b563c0af692e2a09d735ab6711192"

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
