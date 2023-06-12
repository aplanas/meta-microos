SUMMARY = "Documentation for texlive-chordbars"
DESCRIPTION = "This package includes the documentation for texlive-chordbars"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49569"

RPM_NAME = "texlive-chordbars-doc-2023.201.1.1svn49569-53.1.noarch.rpm"
RPM_HASH = "adbbca53a4591f24f281951bb6953f72214a7dd157a6368a4dd7c0a001c68be792be57bff10c29570fa38aecf6b9ab4dd42b2a31b4fed94ca08017f0708f1b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chordbars-doc"
RDEPENDS:${PN} += ""

inherit rpm
