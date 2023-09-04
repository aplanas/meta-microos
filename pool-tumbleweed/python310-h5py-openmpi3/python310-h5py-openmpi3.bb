SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-h5py-openmpi3-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "c5c09a4f7c734d6181c2a853d59e3434133632ea806747a4e5f220308db070718e08ce339828cde80a96f1645a7543d1b2c8cadd45a5ea01636187051f4c0a61"

RPROVIDES:${PN} += "python3.10dist-h5py \
python310-h5py-openmpi3 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python310-mpi4py \
python310-numpy"

inherit rpm
