SUMMARY = "Documentation for texlive-babel-azerbaijani"
DESCRIPTION = "This package includes the documentation for texlive-babel-azerbaijani"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn44197"

RPM_NAME = "texlive-babel-azerbaijani-doc-2023.201.1.0asvn44197-53.1.noarch.rpm"
RPM_HASH = "93dd11fdc724e14bde9179edc7daaff92b1282ab760f0556c3bc0b611a6e975e0c7ba19af20cecdb4722cca5575b69c64994b82c2c0d35815591f1b3983406ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-azerbaijani-doc"
RDEPENDS:${PN} += ""

inherit rpm
