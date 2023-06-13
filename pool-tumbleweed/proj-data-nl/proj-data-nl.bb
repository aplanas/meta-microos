SUMMARY = "Netherlands datum grids for Proj"
DESCRIPTION = "Netherlands datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-nl-9.2.0-1.3.noarch.rpm"
RPM_HASH = "0b34af0f175e90774ce14fffdb3be675e0c4e62106ef8918df651a1dfcef3dadb45ea225de654eb42ab030b5a2e166143414219f87171e91880c3fb2ac8cd1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nl"

RDEPENDS:${PN} += ""

inherit rpm
