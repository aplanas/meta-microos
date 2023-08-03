SUMMARY = "Documentation for texlive-frontespizio"
DESCRIPTION = "This package includes the documentation for texlive-frontespizio"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4asvn24054"

RPM_NAME = "texlive-frontespizio-doc-2023.209.1.4asvn24054-53.1.noarch.rpm"
RPM_HASH = "8df9073bd464ea40cf31c2b15fa19de9ef80d94f5229ec5fc3c606f3d78a466451db7e85c6e695d6e80c9542e7a063b3725cf14930e01d57c95ccf39cc7a3d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-frontespizio-doc-it \
texlive-frontespizio-doc"

RDEPENDS:${PN} += ""

inherit rpm
