SUMMARY = "Documentation for texlive-bardiag"
DESCRIPTION = "This package includes the documentation for texlive-bardiag"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn22013"

RPM_NAME = "texlive-bardiag-doc-2023.209.0.0.4asvn22013-54.1.noarch.rpm"
RPM_HASH = "c8af96698b2a91080be24a3ccf02a62b97906103f21a09a32aa9633043e9230a51e8b79310d14a1f2392b091ff5ddbde41063cd2ed0ef4d0e89e1338d7bf253d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bardiag-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
