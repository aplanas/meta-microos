SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-h5py-openmpi4-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "80312937156a4156ba4b0c26e71165552e386936caa5e27b1c139e7c958c1c3ece26da714fc8c1df96b0bf78887f5359b7c091303d40bc2248fa16a0ff894748"

RPROVIDES:${PN} += "python3.9dist-h5py \
python39-h5py-openmpi4 \
python3dist-h5py"

RDEPENDS:${PN} += "hdf5-openmpi4 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.40 \
python39-mpi4py \
python39-numpy"

inherit rpm
