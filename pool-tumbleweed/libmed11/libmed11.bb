SUMMARY = "A library to store and exchange meshed data"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmed11-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "6e5d38667552976817d5deef74b56dc482c47ff72bcbec84b9a898426c845583681dbb6c9a0e0282fb1c5bad3cc9a408539a53a398bc5dc5b6b108a846bf7280"

RPROVIDES:${PN} += "libmed.so.11 \
libmed11"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
