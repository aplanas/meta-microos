SUMMARY = "South Africa datum grids for Proj"
DESCRIPTION = "South Africa datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-za-9.2.0-1.3.noarch.rpm"
RPM_HASH = "0c7e8251e2e35743da37205d373a5b2d6e2ab871dad35c61e4dfd3eb370a3a77b1581a83486e8621049d8efb4a543db7c4882e3dc308ef7e3e749cf0efcf66fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-za"

RDEPENDS:${PN} += ""

inherit rpm
