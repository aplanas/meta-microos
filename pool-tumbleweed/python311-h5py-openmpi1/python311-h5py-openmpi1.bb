SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi1-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "aa8a2e8121d2ae0ce9b343d6a9bad6fc49752f19930fdae37f425a0fc6203b4a1d981e0088a3480672193f22c41d56e0d41c638a562b0fe9d7532f485dc6ec94"

RPROVIDES:${PN} += "python3.11dist(h5py) \
python311-h5py-openmpi1 \
python311-h5py-openmpi1(aarch-64) \
python3dist(h5py)"

RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libmpi.so.12()(64bit) \
python311-mpi4py \
python311-numpy"

inherit rpm
