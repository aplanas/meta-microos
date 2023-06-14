SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi4-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "8e5b3fe8e70e7eb86c12a8b85a8107eca7c291b78aaa2e6963388ac71f242951f8ec17d3cd5d638525bdeb1d29da485f387587dfa9ecb7eaa3f338d12ea35219"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi4 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi4 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python39-mpi4py \
python39-numpy"

inherit rpm
