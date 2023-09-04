SUMMARY = "Documentation for texlive-guitartabs"
DESCRIPTION = "This package includes the documentation for texlive-guitartabs"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48102"

RPM_NAME = "texlive-guitartabs-doc-2023.209.svn48102-54.2.noarch.rpm"
RPM_HASH = "4a407bf849f3e8661fcec611479510e41d2e41dcfbf6ff4bfdc05c95a4b69ebb8e65d5784c9e97a01782e85601a38e66bcf912bc0af319bc43463500f45d51f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitartabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
