SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "4335c26de4db0fe8472b439d335bc82b69c2a977c93c31c8da444c9103368df9ad2b044c2f1235944c313f7704f9e8275ac0914bc91e3a567b3e30e14899505f"

RPROVIDES:${PN} += "python3.11dist(h5py) \
python311-h5py \
python311-h5py(aarch-64) \
python3dist(h5py)"

RDEPENDS:${PN} += "hdf5 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
