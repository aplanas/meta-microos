SUMMARY = "Mexico datum grids for Proj"
DESCRIPTION = "Mexico datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-mx-9.2.1-1.1.noarch.rpm"
RPM_HASH = "24cf23acda876003ee907c7a0d0c97554240e293367853f7ff6616e5262954d106d5e32122c568fb67dd28951c99449b3c2a0fe32531ea6d3deaf33d68f126e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-mx"

RDEPENDS:${PN} += ""

inherit rpm
