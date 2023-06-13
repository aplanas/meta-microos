SUMMARY = "Documentation for texlive-circuitikz"
DESCRIPTION = "This package includes the documentation for texlive-circuitikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.1svn65785"

RPM_NAME = "texlive-circuitikz-doc-2023.201.1.6.1svn65785-53.1.noarch.rpm"
RPM_HASH = "2108f0c2cd1578107423080adc920ac449d5354c957cf4ce898cfaa161b3e9a33835869c44dff32ac24de79f723c2daa24e7d459a6fab37408b4d16619152130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circuitikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
