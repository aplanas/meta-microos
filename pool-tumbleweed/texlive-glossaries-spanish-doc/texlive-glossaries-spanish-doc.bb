SUMMARY = "Documentation for texlive-glossaries-spanish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "64d11d3da45368d649002b7da15ac419aebe5518393489158961ff4f56ce080d1931b9813ce44352830b8d2e33f84c2b1d97ce5ee4f907135ad90e8477291492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
