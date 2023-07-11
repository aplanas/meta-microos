SUMMARY = "Development package for Palapeli"
DESCRIPTION = "This package contains the development files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "palapeli-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5e272cf681fc06e027c3d70833b676d3a520338a4b153cec29d163e596ab800f73b9ccbc8c87ea0795dbca7e54f7245250ab8ced72177e59d333ef1ab386d91b"

RPROVIDES:${PN} += "cmake-Pala \
palapeli-devel"

RDEPENDS:${PN} += "palapeli"

inherit rpm
