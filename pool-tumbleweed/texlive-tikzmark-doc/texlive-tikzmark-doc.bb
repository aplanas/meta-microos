SUMMARY = "Documentation for texlive-tikzmark"
DESCRIPTION = "This package includes the documentation for texlive-tikzmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn64819"

RPM_NAME = "texlive-tikzmark-doc-2023.209.1.15svn64819-53.1.noarch.rpm"
RPM_HASH = "1c9b0542e081324360b5a6fa977a5408dd353c0321abca98bf50fc7bc75765be6246e3d9935343a07987c0aa4ddde83cf8ec68ab3a540e289c68be3000407f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
