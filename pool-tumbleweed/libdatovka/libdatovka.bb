SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "libdatovka-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "ea6202efcfa7f9eb0ad9d78b481f8b6d5ec615e3aa96afeb87e9860d6247a479b58e116a0bfffe1187f226f47291bf5749bce5014ba71b12520cb0ebb8d488e8"

RPROVIDES:${PN} += "libdatovka"

RDEPENDS:${PN} += ""

inherit rpm
