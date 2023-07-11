SUMMARY = "C++ API for the MED mesh data library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmedC11-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "c308423e9957cebd83f252e1c0a0f4c12b7c5fa00b5af9ae14851852b173d2b9a17a1eafe4108e4df997a27262203422ce41a4d391431d2c6ad0e0d717d5684a"

RPROVIDES:${PN} += "libmedC.so.11 \
libmedC11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
