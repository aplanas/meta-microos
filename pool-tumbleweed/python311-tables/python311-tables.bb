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

RPM_NAME = "python311-tables-3.8.0-2.3.aarch64.rpm"
RPM_HASH = "af903c2eedf458ff1a1afbc775968cf5b3224d826b24aa9e81c2f3783318b3b78718bf90c142c40f63fbd08796f072ca57c62e7a96c40a45974d4e1b92edb555"

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
