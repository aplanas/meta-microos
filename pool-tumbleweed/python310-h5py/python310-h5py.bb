SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-h5py-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "deda5099832817a0b0f88f219a43b5479c0aeffefdfa8cdc52e79dd35e1744d000beefab39d28bfb4d17c26519a9fd2cca9f152892387a9b53081c5d6d9e20c1"

RPROVIDES:${PN} += "python3.10dist-h5py \
python310-h5py \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
python-abi \
python310-numpy"

inherit rpm
