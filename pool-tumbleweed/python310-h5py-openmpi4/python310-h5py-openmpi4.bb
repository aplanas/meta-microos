SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-h5py-openmpi4-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "91cb5492539189f002e18af656e7426b1c0b7ee7e8549605453bf7b9fc37ed860ee394ef58058a1e7a793a4a987435a39da12a5e53d3a499b95310155452941a"

RPROVIDES:${PN} += "python3.10dist-h5py \
python310-h5py-openmpi4 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi4 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python310-mpi4py \
python310-numpy"

inherit rpm
