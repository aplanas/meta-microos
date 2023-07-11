SUMMARY = "Netherlands datum grids for Proj"
DESCRIPTION = "Netherlands datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-nl-9.2.1-1.1.noarch.rpm"
RPM_HASH = "88513ec1016b326256e9bf84e919779c2fe8d02bb4675e4aeb016b9117ec471ebb8150a6f2b711f8624478fcb3a8add66a42a867c3938e13fc221b246b792786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nl"

RDEPENDS:${PN} += ""

inherit rpm
