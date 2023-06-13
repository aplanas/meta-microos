SUMMARY = "Documentation for texlive-bloques"
DESCRIPTION = "This package includes the documentation for texlive-bloques"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn22490"

RPM_NAME = "texlive-bloques-doc-2023.201.1.0svn22490-52.1.noarch.rpm"
RPM_HASH = "2e11eb2133179111cbbb2fd07739d4b4f04d9166740098420a80c12b294763f14b4ec98de0409c1ff0602c037a57b5d8ffd225dbf24b8aac81345e541948d2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bloques-doc"

RDEPENDS:${PN} += ""

inherit rpm
