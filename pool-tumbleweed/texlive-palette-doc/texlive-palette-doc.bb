SUMMARY = "Documentation for texlive-palette"
DESCRIPTION = "This package includes the documentation for texlive-palette"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn60119"

RPM_NAME = "texlive-palette-doc-2023.201.1.1.0svn60119-51.1.noarch.rpm"
RPM_HASH = "48de08e97e35b6aee86e84a7449e17ba685c65aaed676258e14931b76b35054fb63ccc010e0ea66b2a9c77a96f042c41257b2451f517d2602035e5581758dc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-palette-doc"

RDEPENDS:${PN} += ""

inherit rpm
