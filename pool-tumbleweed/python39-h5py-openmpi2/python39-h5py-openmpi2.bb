SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi2-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "7f61edfe3325d79604d81523dc5a2c8ec3b3291b8e534893863bf5ed09794af57ce6d01c952cc30c2164a9af50d5795e5129479d75a15a0ae2d745a3cfb8d529"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi2 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.20 \
python39-mpi4py \
python39-numpy"

inherit rpm
