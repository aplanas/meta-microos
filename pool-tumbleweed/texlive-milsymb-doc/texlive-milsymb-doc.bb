SUMMARY = "Documentation for texlive-milsymb"
DESCRIPTION = "This package includes the documentation for texlive-milsymb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn54361"

RPM_NAME = "texlive-milsymb-doc-2023.209.1.02svn54361-55.1.noarch.rpm"
RPM_HASH = "a2ebc473489fe1af340441a0e0b4adaac1861c05a05cdfad10d4a8006796cc905bde16db269debb14fb661e188f1dcc5ccad87d8279de9427a1e62ffdc661743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-milsymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
