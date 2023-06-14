SUMMARY = "Fortran API for the MED mesh data library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmedfwrap11-4.1.1-1.6.aarch64.rpm"
RPM_HASH = "b348664cd0db70832906fb21640eff6ef0d5ff2be08e5fcd671ed57c495ef650d248b547584446918cffa11b1e7128743100a0438f946b72bf709d669e5e1988"

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
