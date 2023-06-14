SUMMARY = "Python wrapper for the MED library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data. \
 \
This package contains the python bindings"
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmed-python-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "b6d1cd0d935e45abe83a722dc71af94496392c753c904bfff47ab45f527ba46ba21dcd87455dcf5ff1598b68323e045086418d908eed75a27a5aca03430a8c50"

RPROVIDES:${PN} += "libmed-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmedC.so.11 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
