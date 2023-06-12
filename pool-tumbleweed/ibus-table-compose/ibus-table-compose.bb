SUMMARY = "The Compose table for ibus-table"
DESCRIPTION = "ibus-table-compose provides the Compose table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-compose-1.3.13-2.3.noarch.rpm"
RPM_HASH = "3ea8f9c4e4872e9547205517f7562d6db4f5c1673ff06ecba7f3c0b1a784ea7d8395de4c7bd9d83aa4b2db1dde7d15408397850dc5b2765248da9cf543d68104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-compose"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
