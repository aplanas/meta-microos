SUMMARY = "Documentation for texlive-forest"
DESCRIPTION = "This package includes the documentation for texlive-forest"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn57398"

RPM_NAME = "texlive-forest-doc-2023.209.2.1.5svn57398-53.1.noarch.rpm"
RPM_HASH = "4b4ec5eed40c7bc6b1044eb3e45ef757311275f5a33c9c6ac5cdd8d8ad5ff90098668b71e6df6e5230d71480a425a555f215bff810dfe053ac5d0369df883fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forest-doc"

RDEPENDS:${PN} += ""

inherit rpm
