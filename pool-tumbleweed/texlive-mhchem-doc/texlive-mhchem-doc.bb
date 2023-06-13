SUMMARY = "Documentation for texlive-mhchem"
DESCRIPTION = "This package includes the documentation for texlive-mhchem"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61456"

RPM_NAME = "texlive-mhchem-doc-2023.201.svn61456-54.1.noarch.rpm"
RPM_HASH = "d570198083830b1d37ac1857b01d9a84c2089840b521f67f8a536f5af1fb4e8626fcb0fa3fe4a2d9bbb679dffa57289b40c21c8bff9cdc9225b2d580aad3ee21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mhchem-doc"

RDEPENDS:${PN} += ""

inherit rpm
