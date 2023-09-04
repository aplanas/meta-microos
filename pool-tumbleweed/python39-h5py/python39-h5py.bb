SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-h5py-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "4741cd6f98f34e99bea0c94fbec7899685b334a42ee450f75cd982054442e24df78d0bc5717ff9ae8994499fd14485c6fc69928d7710b858b22a26fe41bd8b05"

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
