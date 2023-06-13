SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "534ee5e1ba9881b3e24c25ede9f742c5186ff7efbffcda5b06e586f983714bd0c34360a2de00187b07b53342f986a6b81985907c3fe72cbaf81e60afa9e21e07"

RPROVIDES:${PN} += "python3-h5py \
python3.10dist(h5py) \
python310-h5py \
python310-h5py(aarch-64) \
python3dist(h5py)"

RDEPENDS:${PN} += "hdf5 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
