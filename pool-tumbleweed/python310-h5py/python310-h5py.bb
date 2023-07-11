SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "2d3b38cdb0d91363fd17d3d47f01485b57a144569a5360ab657203a1bd9ffa35164556d108ed4c095b348873cf0e27b4ee7e009aeee195b627ab97fe301d9720"

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
