SUMMARY = "Norway datum grids for Proj"
DESCRIPTION = "Norway datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-no-9.2.1-1.1.noarch.rpm"
RPM_HASH = "1156f5b6030b2147afd0118308fc1b6a093d9540a2c758be39eccfcbd11313b7517a5406c43ed5e1bb9638cc98c37e7d654f45b2e9d26fbe2bcf84c116a5c844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-no"

RDEPENDS:${PN} += ""

inherit rpm
