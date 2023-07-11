SUMMARY = "Documentation for texlive-inputenx"
DESCRIPTION = "This package includes the documentation for texlive-inputenx"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.12svn52986"

RPM_NAME = "texlive-inputenx-doc-2023.208.1.12svn52986-53.1.noarch.rpm"
RPM_HASH = "3d504b2881026053aed455b43ba5ae05744bf0e02199c5507d341602df7edfdfd867f3e9a6edbca474274ba9ca4cec58656d21030a1de273db7f3594a2999a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
