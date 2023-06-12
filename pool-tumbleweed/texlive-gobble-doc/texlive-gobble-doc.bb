SUMMARY = "Documentation for texlive-gobble"
DESCRIPTION = "This package includes the documentation for texlive-gobble"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-gobble-doc-2023.201.0.0.2svn64967-53.1.noarch.rpm"
RPM_HASH = "f3e118c362b2de78ee33ed6403da200085cd0ea0e6592a82db6d282736f394fe17a9a1b120640345acf72ffd2d4b8b49db03b883a2ea7ab9b6a2ba692fb98ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gobble-doc"
RDEPENDS:${PN} += ""

inherit rpm
