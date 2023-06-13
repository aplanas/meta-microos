SUMMARY = "Documentation for texlive-lastpage"
DESCRIPTION = "This package includes the documentation for texlive-lastpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0asvn66461"

RPM_NAME = "texlive-lastpage-doc-2023.201.2.0asvn66461-55.1.noarch.rpm"
RPM_HASH = "e7c07733e6c33f7ad1b4a30734beee52e8c6a097dafb0b22f756c220a7b467b31c8c7074fb2470e256eac85516c3dbdfca1886d5b32d594d7f9a3f1d01b3bfd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
