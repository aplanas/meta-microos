SUMMARY = "Documentation for texlive-tocvsec2"
DESCRIPTION = "This package includes the documentation for texlive-tocvsec2"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn33146"

RPM_NAME = "texlive-tocvsec2-doc-2023.201.1.3asvn33146-52.1.noarch.rpm"
RPM_HASH = "2bd3b366bf2e72a3dcb0db47e11e2a1302e2ec3bebebf5faec5a636e3c4187c3f67221d0ab94887608263b9d0ac9ad5ead9509b2333161f938398a2430e8ce33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocvsec2-doc"

RDEPENDS:${PN} += ""

inherit rpm
