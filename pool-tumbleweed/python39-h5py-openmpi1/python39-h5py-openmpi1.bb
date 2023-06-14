SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi1-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "c9137a2182e13bfc0594a4c24bef4e8c1b648193796941ccaad9ce93758df8eb26b2095bd4ab4e2880907e9442a761afb0200ff77ead362fe171f50c67083715"

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
