SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi4-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "b43c9440ca139353e53cf93f41f577ddb4f24fb8bfeef1c41787ad13bef2ac5b4ecdc0695ae949dac45f9e1d337d384a054efa075ea4c1359559aed34be31978"

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
