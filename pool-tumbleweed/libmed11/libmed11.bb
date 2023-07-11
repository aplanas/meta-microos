SUMMARY = "A library to store and exchange meshed data"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "libmed11-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "274a8170cb027e6cf6070e9c02561ee46636fcf83505204e24d86f565e820c4fdbcab0af59da3bd27e70fe2ec54432fe9c0b3455b8fff38fa5a907a07c73faaf"

RPROVIDES:${PN} += "libmed.so.11 \
libmed11"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
