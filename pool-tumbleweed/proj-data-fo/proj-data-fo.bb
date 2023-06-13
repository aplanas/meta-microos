SUMMARY = "Faroe Island datum grids for Proj"
DESCRIPTION = "Faroe Island datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-fo-9.2.0-1.3.noarch.rpm"
RPM_HASH = "10fa14786ea04db9957a3b78298ad5c65cffa836e5fd141483685197612992229c32e79b721def72eed0b6a6d17569f826d57a92a3a18025311c27fd24290d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fo"

RDEPENDS:${PN} += ""

inherit rpm
