SUMMARY = "Development files for bridge-utils"
DESCRIPTION = "The bridge-utils devel package contains files needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "bridge-utils-devel-1.7.1-1.10.aarch64.rpm"
RPM_HASH = "4b2e7aecf6833d7e96f422d3da80f1e2f851c4c66322a6e9d5f823c9566c5c2bc14804c22cd04fdc8cd2dfbc7f509b53850dd418dcd6a5741f367ec6a44298d7"

RPROVIDES:${PN} += "bridge-utils-devel"

RDEPENDS:${PN} += "bridge-utils"

inherit rpm
