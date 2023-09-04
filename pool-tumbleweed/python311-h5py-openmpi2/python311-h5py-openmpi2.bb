SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-h5py-openmpi2-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "146c2b17d490411d02d85264015bec2683f560c3c8fbb0ad5881fa5aff81c13feb94506ed7a9bb8c5797af096c87af739c392611aba927a5b6dcd06784ea3656"

RPROVIDES:${PN} += "python3-h5py-openmpi2 \
python3.11dist-h5py \
python311-h5py-openmpi2 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.20 \
python311-mpi4py \
python311-numpy"

inherit rpm
