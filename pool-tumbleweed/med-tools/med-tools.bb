SUMMARY = "A library to store and exchange meshed data"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "med-tools-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "53fae75cce105c67acae5a92c8a9e23865bf59db8c12631c3e10f8f5091c56cd3daf3eda18d60ae39269aeab2157cf69747ea889bff6daa7fd4cbd8faea51786"

RPROVIDES:${PN} += "med-tools"

RDEPENDS:${PN} += "/usr/bin/wish \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmedC.so.11 \
libmedimport.so.0 \
libstdc++.so.6"

inherit rpm
