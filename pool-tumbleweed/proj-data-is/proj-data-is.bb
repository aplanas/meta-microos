SUMMARY = "Island datum grids for Proj"
DESCRIPTION = "Island datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-is-9.2.0-1.3.noarch.rpm"
RPM_HASH = "8bda6e7321d2d22f85d77007d06c6aabc600ca2b18a1a92abbb2ece830fe21b2185bfe1adf6ca0e03f848ad406159d557080633f24955ab9879624e6b604fefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-is"

RDEPENDS:${PN} += ""

inherit rpm
