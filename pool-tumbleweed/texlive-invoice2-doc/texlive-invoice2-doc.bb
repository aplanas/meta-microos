SUMMARY = "Documentation for texlive-invoice2"
DESCRIPTION = "This package includes the documentation for texlive-invoice2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn46364"

RPM_NAME = "texlive-invoice2-doc-2023.201.svn46364-52.1.noarch.rpm"
RPM_HASH = "196ad6704caf08dff3bdd2b1368ded1d269a7b8a80b2f74a720bfe66aa47df1cd904542991d302fdd75ad670187049a2268a5cf39770cfc088a5d2cc9bd7b366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice2-doc"
RDEPENDS:${PN} += ""

inherit rpm
