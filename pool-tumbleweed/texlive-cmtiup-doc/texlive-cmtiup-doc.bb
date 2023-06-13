SUMMARY = "Documentation for texlive-cmtiup"
DESCRIPTION = "This package includes the documentation for texlive-cmtiup"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn39728"

RPM_NAME = "texlive-cmtiup-doc-2023.201.2.1svn39728-53.1.noarch.rpm"
RPM_HASH = "1d2f7708a2e788891dee84fdeeb54d1a06eef3795533b869791819e50d17c78cb7118d572b71352f06f4821795666423029a52b2521ad4ed2d6f2372c61f630e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmtiup-doc"

RDEPENDS:${PN} += ""

inherit rpm
