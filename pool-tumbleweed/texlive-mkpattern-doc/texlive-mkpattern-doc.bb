SUMMARY = "Documentation for texlive-mkpattern"
DESCRIPTION = "This package includes the documentation for texlive-mkpattern"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-mkpattern-doc-2023.201.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "237e047e3f3f59527959b8a5173aa3b3fd92110bd0764836810173cef56ffd7e47137baf9b6efeb1a7d9a425305b5531619efcb0a962f0050e36eb44ae189011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
