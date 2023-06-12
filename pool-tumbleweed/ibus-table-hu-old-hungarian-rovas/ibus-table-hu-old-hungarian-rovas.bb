SUMMARY = "Hu old hungarian rovas table for ibus-table"
DESCRIPTION = "ibus-table-rusle provides the Hu old hungarian rovas table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-hu-old-hungarian-rovas-1.3.13-2.3.noarch.rpm"
RPM_HASH = "ba7762e45f2efa2702edca02353f01713b5c27921c22145b6cf60718be97af523d068b7ea7f5e42bbc646e6a869d7ff541af585bc82ba0cd41ef9a37846f8c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-hu-old-hungarian-rovas"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
