SUMMARY = "Documentation for texlive-yplan"
DESCRIPTION = "This package includes the documentation for texlive-yplan"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34398"

RPM_NAME = "texlive-yplan-doc-2023.201.svn34398-52.2.noarch.rpm"
RPM_HASH = "2644988dbbe0e436074f832daf225d9cf63e3f9750314610a8ff761dc0fc232d1d4e3aecf295b09effd4c44e5a8214d2faa60655abaf9479dbb6977eaa22fe50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yplan-doc"

RDEPENDS:${PN} += ""

inherit rpm
