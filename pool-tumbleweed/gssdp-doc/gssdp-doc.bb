SUMMARY = "Documentation for gssdp"
DESCRIPTION = "Documentation for gssdp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "gssdp-doc-1.6.2-2.1.noarch.rpm"
RPM_HASH = "5a5c3a3fd47dc16ed90fe22000ec5748ceb9f9e3344cdc865a6f699fa46fa5d78a1a0805e53f207f847c160a12de45385055152c5d33883bc17166d520617363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gssdp-doc"

RDEPENDS:${PN} += ""

inherit rpm
