SUMMARY = "Documentation for texlive-sr-vorl"
DESCRIPTION = "This package includes the documentation for texlive-sr-vorl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn59333"

RPM_NAME = "texlive-sr-vorl-doc-2023.201.1.2svn59333-57.1.noarch.rpm"
RPM_HASH = "16622e6fa43cf400cbc899734701164d6dae3344ef841c3c2bff9fbe789341822cdff607d02bba860f55c7623ac92702244834f5961e3885f22b2acf29a8bde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sr-vorl-doc"

RDEPENDS:${PN} += ""

inherit rpm
