SUMMARY = "Documentation for texlive-tex-locale"
DESCRIPTION = "This package includes the documentation for texlive-tex-locale"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48500"

RPM_NAME = "texlive-tex-locale-doc-2023.209.1.0svn48500-55.1.noarch.rpm"
RPM_HASH = "c2acc3a922d584d66762a19939292bd44f68bcdc83dd102c6a4a4ca0ff935968bcd13501a008bdd36712555a6e5c96f2086d7f5e886550c25ab064895d935d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-locale-doc"

RDEPENDS:${PN} += ""

inherit rpm
