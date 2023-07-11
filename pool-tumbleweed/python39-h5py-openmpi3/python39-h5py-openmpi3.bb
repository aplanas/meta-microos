SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi3-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "efb55873f8a9a5db5f34d26d19c7a04178eedb6c348ad99f2f82dd0ce3e28612eb1992f39180c6998ccd479fe3644d0c306fab37e5b57ef2443e0cca6b1d4c4b"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi3 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python39-mpi4py \
python39-numpy"

inherit rpm
