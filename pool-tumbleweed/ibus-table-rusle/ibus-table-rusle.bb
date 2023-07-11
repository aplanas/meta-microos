SUMMARY = "Rusle table for ibus-table"
DESCRIPTION = "ibus-table-rusle provides the Rusle table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-rusle-1.3.16-1.1.noarch.rpm"
RPM_HASH = "3d298891b479457fe24612b27987259f76115a2f0fff9dbaa883a96086f0828fffe21bb4e3161ce0249ec7743b49e9762824a9c2f90360dcc82fe9404a713067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-rusle"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
