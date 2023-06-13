SUMMARY = "Documentation for texlive-mathfam256"
DESCRIPTION = "This package includes the documentation for texlive-mathfam256"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.5svn53519"

RPM_NAME = "texlive-mathfam256-doc-2023.201.0.0.5svn53519-52.1.noarch.rpm"
RPM_HASH = "704165866b3935c16aef98e7627e64387b1d3027c5e0187c917f8b50b48a644d725d7177bf02b19eddbc4e33c69d9bd8ca3aef43c02f1dc9ddab6ca0ce6f86b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfam256-doc"

RDEPENDS:${PN} += ""

inherit rpm
