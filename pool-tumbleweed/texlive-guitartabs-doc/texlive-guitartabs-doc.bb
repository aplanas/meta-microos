SUMMARY = "Documentation for texlive-guitartabs"
DESCRIPTION = "This package includes the documentation for texlive-guitartabs"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48102"

RPM_NAME = "texlive-guitartabs-doc-2023.201.svn48102-53.1.noarch.rpm"
RPM_HASH = "72921444b1c3e49ee0af051baaa6543be01d5faeb9e37f12b1cff5ae38f508f7bb1daae157aa0439fb32adcd588b0e74252b307bfcb3c4dc5285489bcce4e21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitartabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
