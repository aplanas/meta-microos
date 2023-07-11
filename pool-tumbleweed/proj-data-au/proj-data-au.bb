SUMMARY = "Australia datum grids for Proj"
DESCRIPTION = "Australia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-au-9.2.1-1.1.noarch.rpm"
RPM_HASH = "826cce2c02ae987d24f0381364b1bdc4273d307bc7ec5680d09e9e067453da0ae8514bd89b344011a1ba042cb699f0e58314571eff1919c5a785c9d8e624ba9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-au"

RDEPENDS:${PN} += ""

inherit rpm
