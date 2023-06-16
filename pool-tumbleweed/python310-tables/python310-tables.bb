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

RPM_NAME = "python310-tables-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "a611f0df5ef4a877ba0886b20dd4196001ea40cea35d5fe783b9813a04e23f2edca2982c3eb0394d56908b10dd879b43bec20e9a3a573e2469a7c651f9572172"

RPROVIDES:${PN} += "python3-tables \
python3.10dist-tables \
python310-tables \
python3dist-tables"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
hdf5 \
ld-linux-aarch64.so.1 \
libblosc.so.1 \
libblosc2.so.2 \
libbz2.so.1 \
libc.so.6 \
libhdf5.so.200 \
liblzo2.so.2 \
python-abi \
python310-Cython \
python310-numexpr \
python310-numpy \
python310-packaging \
python310-py-cpuinfo \
update-alternatives"

inherit rpm
