SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi1-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "d9daa4811ecec063842ef5963cff9810a83209ebfc13d03c344e9d213d6c00ebf0c6c17e2adc8ba6747935e4037fb6e53635143dce5a9335470327515f9eccf9"

RPROVIDES:${PN} += "python3.10dist-h5py \
python310-h5py-openmpi1 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.12 \
python310-mpi4py \
python310-numpy"

inherit rpm
