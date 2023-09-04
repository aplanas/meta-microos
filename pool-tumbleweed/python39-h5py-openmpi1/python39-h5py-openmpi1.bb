SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-h5py-openmpi1-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "25cee6c5f11df842f6131931f1826cb1d953634c574e8b0e959cd743dbb6a9143e4178ea474b0f64970e416c40c33ffef1c9c72ccac180d5aa9c4d170f2534b1"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi1 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.12 \
python39-mpi4py \
python39-numpy"

inherit rpm
