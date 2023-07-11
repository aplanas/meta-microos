SUMMARY = "Python wrapper for the MED library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data. \
 \
This package contains the python bindings"
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmed-python-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "78015b9d55b2252f2283522aad6d64cc25049e08074ca5023594faabf3b421248196936d7adc5f15cb22a3ab273b1b11ff6af83754d49b949b0c2de07f3cd66c"

RPROVIDES:${PN} += "libmed-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmedC.so.11 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
