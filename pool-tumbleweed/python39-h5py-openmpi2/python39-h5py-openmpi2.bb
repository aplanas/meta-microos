SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi2-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "66efc4bdb987484dd117ffd7b56ab30176f4cef671e9cb3d12c95670d4dab16df09c0eefaf5651762fe48644352546076d750a9b26e17a7ef818edc497e48d1d"

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
