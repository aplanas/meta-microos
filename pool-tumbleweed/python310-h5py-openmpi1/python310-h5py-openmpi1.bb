SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-h5py-openmpi1-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "017c661170dfbcaf149fabe9ac163f77438b5bc38ecbc2c2b14ea3b30bbd354fc0cf8be8abcf3abaa2c5aee377c7593b9fdd7f5394eedd90067c42e7b66b7df5"

RPROVIDES:${PN} += "python3.10dist-h5py \
python310-h5py-openmpi1 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.12 \
python310-mpi4py \
python310-numpy"

inherit rpm
