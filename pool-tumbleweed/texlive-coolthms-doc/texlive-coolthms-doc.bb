SUMMARY = "Documentation for texlive-coolthms"
DESCRIPTION = "This package includes the documentation for texlive-coolthms"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2svn29062"

RPM_NAME = "texlive-coolthms-doc-2023.204.1.2svn29062-54.1.noarch.rpm"
RPM_HASH = "c11959948883d9b7ebf2a57e9f8e8eb1d5c281c4b469537720ff026050db01de7c14e820cbf17c76ceb541907a0544b9f59313b6a3f840583e9d7cdcfcdd79c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolthms-doc"

RDEPENDS:${PN} += ""

inherit rpm
