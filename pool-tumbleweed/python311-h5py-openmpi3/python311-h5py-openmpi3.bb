SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi3-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "87faba738db514f63bc30f4b3de03aab12dc2959b195704ef6856e04602e333de2d866b5ea9e499a4833e471594ee2b29e88c5f31cf2bd2cd1af3c80766b7086"

RPROVIDES:${PN} += "python3.11dist(h5py) \
python311-h5py-openmpi3 \
python311-h5py-openmpi3(aarch-64) \
python3dist(h5py)"
RDEPENDS:${PN} += "hdf5-openmpi3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libmpi.so.40()(64bit) \
python311-mpi4py \
python311-numpy"

inherit rpm
