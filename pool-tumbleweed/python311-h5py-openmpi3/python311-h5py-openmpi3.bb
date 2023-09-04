SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python311-h5py-openmpi3-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "9b318e8064e0f951919eaf96801f145281d886b5658cf78cf6d7da10f04f8bb6080d5ccdded05ff14184444c0e79958ab2f95849f23633fa7556a265f36120e3"

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
