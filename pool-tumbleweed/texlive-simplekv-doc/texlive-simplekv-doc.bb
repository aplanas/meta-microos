SUMMARY = "Documentation for texlive-simplekv"
DESCRIPTION = "This package includes the documentation for texlive-simplekv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn64578"

RPM_NAME = "texlive-simplekv-doc-2023.209.0.0.2asvn64578-54.1.noarch.rpm"
RPM_HASH = "36bb37f26f2626ad5ac1d540860bd067eaa673028f1ae3b3b0337549a1604f03c2d9bfdc207eb986109990a82ea734a233e44afd56400bd6e7d4a8263f55efe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-simplekv-doc-fr \
texlive-simplekv-doc"

RDEPENDS:${PN} += ""

inherit rpm
