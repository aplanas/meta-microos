SUMMARY = "Libmed development files"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmed-devel-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "83cf396c10bfaaa4bb3ef3639879b5fc5a85580be1bf6a559edc91a7162b9ac9e044a9fbb9ec314e5a6267595676d237f60d5372a2eaf0603b45d4006bec5182"

RPROVIDES:${PN} += "cmake-MEDFile \
libmed-devel"

RDEPENDS:${PN} += "hdf5-devel \
libmed11 \
libmedC11 \
libmedimport0"

inherit rpm
