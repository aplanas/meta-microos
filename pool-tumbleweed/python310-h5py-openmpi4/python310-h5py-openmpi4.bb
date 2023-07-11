SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi4-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "85ea852a6456d03d98491404ad48b60b0aa1527e4dea2391d36e2096e97126858dc64cc467c420070475607545ab0520740560346c630a2806d8ae38992c3057"

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
