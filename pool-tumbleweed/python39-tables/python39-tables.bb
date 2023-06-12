SUMMARY = "Hierarchical datasets for Python"
DESCRIPTION = "PyTables is a package for managing hierarchical datasets and \
designed to efficently cope with extremely large amounts of \
data. PyTables is built on top of the HDF5 library and the \
NumPy package and features an object-oriented interface \
that, combined with C-code generated from Pyrex sources, \
makes of it a fast, yet extremely easy to use tool for \
interactively save and retrieve large amounts of data."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-tables-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "a26fccd15b03d843459368de949b6c656473d996b85681f8e9e80edd0217f572c931f0eab61eb6b21b87f0bd60d4057f943cf55d3986a894e405910667939bb5"

RPROVIDES:${PN} += "python3.9dist(tables) \
python39-tables \
python39-tables(aarch-64) \
python3dist(tables)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
hdf5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblosc.so.1()(64bit) \
libblosc2.so.2()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5.so.200()(64bit) \
liblzo2.so.2()(64bit) \
python(abi) \
python39-Cython \
python39-numexpr \
python39-numpy \
python39-packaging \
python39-py-cpuinfo \
update-alternatives"

inherit rpm
