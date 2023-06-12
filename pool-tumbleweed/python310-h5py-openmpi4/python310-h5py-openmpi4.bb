SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi4-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "0797e9b7dbbf026ca2151bea6be96135785ee148fc94d46bc29280a2deaa709ab77fea048e5ed72024b3d18c066cfa32a7c981dba02a8d4fdfba0906c0b8b62d"

RPROVIDES:${PN} += "python3-h5py-openmpi4 \
python3.10dist(h5py) \
python310-h5py-openmpi4 \
python310-h5py-openmpi4(aarch-64) \
python3dist(h5py)"
RDEPENDS:${PN} += "hdf5-openmpi4 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libmpi.so.40()(64bit) \
python310-mpi4py \
python310-numpy"

inherit rpm
