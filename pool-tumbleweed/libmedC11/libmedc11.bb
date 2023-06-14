SUMMARY = "C++ API for the MED mesh data library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmedC11-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "12824b8fff5adfb0217de6b17fd1f43a740fe9b9b3e6d6531b2f09f9d5c55a7d51e2883df69c88472782564f7064f91fcb59b30784c94265229602e40150029b"

RPROVIDES:${PN} += "libmedC.so.11 \
libmedC11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
