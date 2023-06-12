SUMMARY = "Documentation for texlive-mleftright"
DESCRIPTION = "This package includes the documentation for texlive-mleftright"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn53021"

RPM_NAME = "texlive-mleftright-doc-2023.201.1.2svn53021-54.1.noarch.rpm"
RPM_HASH = "45b6cb63c026843046147b9e5b9e9bdbef2a609a9bfea9a7da3b7d56d1ecee646d41c314c75c65af010025009b7d463643247b35a674d2d78e7b645d676f88a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mleftright-doc"
RDEPENDS:${PN} += ""

inherit rpm
