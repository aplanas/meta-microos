SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi2-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "c67d8c6765012ced3d250b0b3b6106650560574d18cca79353b7380bddb9272244c054c6cdc7afdcdbae7645db9c6074a5f08c624ec935b6c6e6a752a6ae119b"

RPROVIDES:${PN} += "python3-h5py-openmpi2 \
python3.10dist-h5py \
python310-h5py-openmpi2 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.20 \
python310-mpi4py \
python310-numpy"

inherit rpm
