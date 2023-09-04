SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-h5py-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "fca3fb60f602a28be787f06de74d85ed13ef63dbaa2b7e8913d8d4d4132c1b4f52e493fb802f7cdab6ca1ed3982c9d5a225efb606c449b7d2f8f79901ab59d84"

RPROVIDES:${PN} += "python3-h5py \
python3.11dist-h5py \
python311-h5py \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
python-abi \
python311-numpy"

inherit rpm
