SUMMARY = "Documentation for texlive-latexbug"
DESCRIPTION = "This package includes the documentation for texlive-latexbug"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0nsvn63596"

RPM_NAME = "texlive-latexbug-doc-2023.201.1.0nsvn63596-54.1.noarch.rpm"
RPM_HASH = "1f82cd2c5a41be98b3c1eef26836b02dc6205dbda2bb8afe70693f8d647f372b8329a99a1173cfc838554d3bf34585b5a5f6e6d9c4e6ee83a487c5859b3a843b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexbug-doc"
RDEPENDS:${PN} += ""

inherit rpm
