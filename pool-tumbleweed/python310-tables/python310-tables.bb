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

RPM_NAME = "python310-tables-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "717b2912c740be451e4d3dbaccdbfe3a18c48784bdaf0cc125c3e872bda3fc355e2d5e5e668e1e9abc01c68ea11558d0d8326f9a7f87f82d7df5ac8b340ac5b1"

RPROVIDES:${PN} += "python3.10dist-tables \
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
