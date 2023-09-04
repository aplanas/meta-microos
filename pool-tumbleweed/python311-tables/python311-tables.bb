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

RPM_NAME = "python311-tables-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "d9733d9858e3795cc3b3584c8e7784cafd18152b5e98b854087c431690ecc9866d7bf6a81b2361d874d8aa1905775c71998e077d4471039f12623480dc7739b9"

RPROVIDES:${PN} += "python3-tables \
python3.11dist-tables \
python311-tables \
python3dist-tables"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
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
python311-Cython \
python311-numexpr \
python311-numpy \
python311-packaging \
python311-py-cpuinfo \
update-alternatives"

inherit rpm
