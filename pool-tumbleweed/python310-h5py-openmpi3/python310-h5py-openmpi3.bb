SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi3-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "a34101197ac14e1c3687fdc569d3d7cb502d904dbb56167cd35cba405385f9a471f315e98c6c2dfe252f5eb9325adb57cbbc8ebd6895e7a53b944518a827db72"

RPROVIDES:${PN} += "python3-h5py-openmpi3 \
python3.10dist-h5py \
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
