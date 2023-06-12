SUMMARY = "Documentation for texlive-returntogrid"
DESCRIPTION = "This package includes the documentation for texlive-returntogrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-doc-2023.201.0.0.2svn48485-53.1.noarch.rpm"
RPM_HASH = "08bc107b002903e14d813f9d200a220fb9fca1c0ae5f164c3d1e654294353506597ac90b6bb59f3bcfca560261dd1aec511344a85ae79ccb332f59b3e551345e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-returntogrid-doc"
RDEPENDS:${PN} += ""

inherit rpm
