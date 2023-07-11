SUMMARY = "Spain datum grids for Proj"
DESCRIPTION = "Spain datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-es-9.2.1-1.1.noarch.rpm"
RPM_HASH = "fb9344378c7ca4ecd446fc3b64a5472726934ccecc2a70968dd0012f4417eaba835ea09d7fc96079fb0c0e0ab4cc1482905ac3058a9f3b28115501e2ee6d25a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-es"

RDEPENDS:${PN} += ""

inherit rpm
