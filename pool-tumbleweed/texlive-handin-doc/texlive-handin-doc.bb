SUMMARY = "Documentation for texlive-handin"
DESCRIPTION = "This package includes the documentation for texlive-handin"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-doc-2023.201.0.0.1.1svn48255-53.2.noarch.rpm"
RPM_HASH = "4d4d186c94b9ebeb82290f5bf82f1aabb6f35f8c01f165c771ab408b31ff1be669a500f3f7456a9251b8ee0b401b15ecd6280b08c4e75cfe8e0d02d067874fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handin-doc"

RDEPENDS:${PN} += ""

inherit rpm
