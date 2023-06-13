SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "43d5c77f95aa4f101c6f8805d82682e88ecd878738f728449e2128c09f17667454f02de5594fd51bb13ecb599e5f13c54c9751c40c16a01138f6d1e661cd3e16"

RPROVIDES:${PN} += "python3.9dist(h5py) \
python39-h5py \
python39-h5py(aarch-64) \
python3dist(h5py)"

RDEPENDS:${PN} += "hdf5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
