SUMMARY = "Documentation for texlive-delimseasy"
DESCRIPTION = "This package includes the documentation for texlive-delimseasy"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn39589"

RPM_NAME = "texlive-delimseasy-doc-2023.201.2.0svn39589-52.1.noarch.rpm"
RPM_HASH = "012e20b41788087c1b5fa785a9b00a1c488d85eedb3ea4d8143590fd4cb6eccc605c91b1a8eafa5f696d671e3003487f7b1893d707c20ce764803767fd836542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimseasy-doc"

RDEPENDS:${PN} += ""

inherit rpm
