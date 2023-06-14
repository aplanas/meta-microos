SUMMARY = "Libmed development files"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmed-devel-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "1262c26755523fa141272cdc8963f64070da1ffdca18f809199226abec1fb9c7461a8c93c5f6c5594fcaa04a120dab729fb07d09d9f692cf1a514d09e1f4aa92"

RPROVIDES:${PN} += "cmake-MEDFile \
libmed-devel"

RDEPENDS:${PN} += "hdf5-devel \
libmed11 \
libmedC11 \
libmedimport0"

inherit rpm
