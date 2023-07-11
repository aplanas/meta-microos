SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi4-3.8.0-2.7.aarch64.rpm"
RPM_HASH = "d923e212319b769c852b0637ed91d3204a3d8dd53953ad50e0d9778462ceaa4003a1a807544d4d7bc2895a8febc2bfacb2e64451a9225a2384c67d3e52f5b6f4"

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
