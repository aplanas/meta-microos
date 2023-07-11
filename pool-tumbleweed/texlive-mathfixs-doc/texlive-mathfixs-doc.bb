SUMMARY = "Documentation for texlive-mathfixs"
DESCRIPTION = "This package includes the documentation for texlive-mathfixs"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.01svn49547"

RPM_NAME = "texlive-mathfixs-doc-2023.208.1.01svn49547-53.1.noarch.rpm"
RPM_HASH = "63a4b7748facf16cbe5c326c28c5e1281ed35d7f784bfe83b32b28e3f0609d4ecf2e2240ab4d5e40200457d39d11b3bfe23f906c9a5c8792e87d03787c06b23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfixs-doc"

RDEPENDS:${PN} += ""

inherit rpm
