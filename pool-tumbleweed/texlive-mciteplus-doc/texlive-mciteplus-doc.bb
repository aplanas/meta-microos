SUMMARY = "Documentation for texlive-mciteplus"
DESCRIPTION = "This package includes the documentation for texlive-mciteplus"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn31648"

RPM_NAME = "texlive-mciteplus-doc-2023.208.1.2svn31648-53.1.noarch.rpm"
RPM_HASH = "61bd26c3a04dcd1c7d3353f38c74e5c82c2f9184262cdd0600eea3a0b950f4601493805869d414c170719d84751a8f76a67f755ffeef21e6f3cf752ecc84c54f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mciteplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
