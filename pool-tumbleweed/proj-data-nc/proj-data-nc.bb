SUMMARY = "New Caledonia datum grids for Proj"
DESCRIPTION = "New Caledonia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-nc-9.2.0-1.3.noarch.rpm"
RPM_HASH = "12c3f390871810bf0190d5069361d91ebd55e4686b09449d65fb73af5c89efb1f5ede144cefdd6ece847b2442a155bbf5b35b34633c1985caf66246e87fff8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nc"

RDEPENDS:${PN} += ""

inherit rpm
