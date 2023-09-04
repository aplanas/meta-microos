SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-h5py-openmpi3-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "b116532519f0d2950db96db58e792e20e88525443c63a2d2884fd40b46d1daf89996e5d79c1f20f2c64a073f6a300e5da35e482207f994b5eef97c331891f656"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi3 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python39-mpi4py \
python39-numpy"

inherit rpm
