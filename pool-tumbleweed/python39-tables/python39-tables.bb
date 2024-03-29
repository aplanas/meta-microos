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

RPM_NAME = "python39-tables-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "99bb0b884554c52a9e16bde6cc520571c8c59b507b9933bdf7977ee8b20717b7f7425fce4af221f9bb3e9b0a02aaafd1f62befe50abeb72c528030f4c64f5c50"

RPROVIDES:${PN} += "python3.9dist-tables \
python39-tables \
python3dist-tables"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
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
python39-Cython \
python39-numexpr \
python39-numpy \
python39-packaging \
python39-py-cpuinfo \
update-alternatives"

inherit rpm
