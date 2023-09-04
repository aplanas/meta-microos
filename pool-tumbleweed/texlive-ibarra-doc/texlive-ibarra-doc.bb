SUMMARY = "Documentation for texlive-ibarra"
DESCRIPTION = "This package includes the documentation for texlive-ibarra"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64567"

RPM_NAME = "texlive-ibarra-doc-2023.209.svn64567-54.1.noarch.rpm"
RPM_HASH = "3e2bf929aea540c76aae129331b5af19551c1e485cab68b439449a17c6e7e32ca8f8e3eea0b25a39d1cbf1c5590d33a2129ec074108964810d557b052c18427d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibarra-doc"

RDEPENDS:${PN} += ""

inherit rpm
