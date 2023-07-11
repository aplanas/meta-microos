SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi3-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "2d145088c6188f3e333cc7c192288e63b610899f9689db3b45286fb886f49d991eede589e9310861c0d32720fcd21095b388f878c654bbafd0afa6fbaa1a609a"

RPROVIDES:${PN} += "python3-h5py-openmpi3 \
python3.11dist-h5py \
python311-h5py-openmpi3 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python311-mpi4py \
python311-numpy"

inherit rpm
