SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "4fa5aef6c13b550be5697946f1383f39aef7c30c00b24191ccd79f402d6b0375a134f812dcf75a9ea3ca9298a8fea6178348c4741fd79bab55e8ab3168d62ed1"

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
