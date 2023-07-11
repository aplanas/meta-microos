SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "4b50a3c0119f89515680b0ab2dff23b115e06b958739b184bfbfd4a653f828b99a87b0b223ceff551fdbde0d5c5d8178e1bd15c55d85372b4ad4ac1263091aa0"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
python-abi \
python39-numpy"

inherit rpm
