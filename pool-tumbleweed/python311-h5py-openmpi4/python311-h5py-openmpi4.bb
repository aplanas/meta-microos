SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi4-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "593fd8eb469c5c78dc20365e2f0519cdd4b187728d9232cba899328e76b4e92c62b694139705ef96dc43f2640b070c9651f565c6aec722bbcb3936bbf72718dc"

RPROVIDES:${PN} += "python3.11dist(h5py) \
python311-h5py-openmpi4 \
python311-h5py-openmpi4(aarch-64) \
python3dist(h5py)"
RDEPENDS:${PN} += "hdf5-openmpi4 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libmpi.so.40()(64bit) \
python311-mpi4py \
python311-numpy"

inherit rpm
