SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi3-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "6bdb98f2c6f669045defc8fccfb03395b6d119f0f57273c32348cc3f2689f115ea80aa4390993702332f482e742d510c40183c36d5d81c3229564d3de519d5d0"

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
