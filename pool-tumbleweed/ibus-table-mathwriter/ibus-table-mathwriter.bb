SUMMARY = "Mathematics symbols table for ibus-table"
DESCRIPTION = "The package contains table for writing Unicode mathematics symbols."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-mathwriter-1.3.13-2.3.noarch.rpm"
RPM_HASH = "d1bba5c5d2efc9d98c1648553e3bb1123f4da864945c0dc0b71813e925ae953d6e30e13b1d06a726691d4e19ec52d139d9f729852c721ff29dfed9a4b9d0a4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-mathwriter"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
