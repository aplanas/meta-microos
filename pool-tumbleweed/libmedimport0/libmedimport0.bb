SUMMARY = "MED import Library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmedimport0-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "5b13481191bc5612efe0bd59cb8189b93df25362751cec24eb7efc865f4ab96cd00e07cf2e5720cbe19c60fc620b4c049c31e7f3fe689732a27a06bc3d46e577"

RPROVIDES:${PN} += "libmedimport.so.0 \
libmedimport0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libmedC.so.11"

inherit rpm
