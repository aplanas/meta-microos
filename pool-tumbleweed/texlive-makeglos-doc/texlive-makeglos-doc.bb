SUMMARY = "Documentation for texlive-makeglos"
DESCRIPTION = "This package includes the documentation for texlive-makeglos"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-makeglos-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "2abf42f00f71c528b08c49ee3b42f17b0775ad5ed4fe0759bf59d8f6628c1d57f1cee28d1ced447a395c28034af82f26c573d89d1ca81047c53c20b713914058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeglos-doc"
RDEPENDS:${PN} += ""

inherit rpm
