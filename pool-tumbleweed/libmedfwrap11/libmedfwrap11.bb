SUMMARY = "Fortran API for the MED mesh data library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmedfwrap11-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "9e6426f2567ce845997a7b566c70f615fdfa84fb06edaf5b46db2811ff107f9c9667533eaebb2e7f9571cf4696b390241d87580a5d7e8cbdd9c8e683e42e29aa"

RPROVIDES:${PN} += "libmedfwrap.so.11 \
libmedfwrap11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmedC.so.11 \
libstdc++.so.6"

inherit rpm
