SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-h5py-openmpi4-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "8a5049eb5f5359d240609fb1ae953b06f469cbe7b294e0a058e042b88cd217472ffb76bbc3d0dcbe69c4e5326d7bea4c729ce781cc07458718c7e2bc8e20a14f"

RPROVIDES:${PN} += "python3-h5py-openmpi4 \
python3.11dist-h5py \
python311-h5py-openmpi4 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi4 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python311-mpi4py \
python311-numpy"

inherit rpm
