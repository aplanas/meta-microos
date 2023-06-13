SUMMARY = "Documentation for texlive-edichokey"
DESCRIPTION = "This package includes the documentation for texlive-edichokey"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-doc-2023.201.2.01ysvn56223-53.1.noarch.rpm"
RPM_HASH = "645ace9818417c5054f65b6e216d0a26c03a9958a489098176f4f372a51a3ebab32ed5887a46ffe5025d20d45bd2159677b8c3bc5501ece5d330e0ea83426f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
