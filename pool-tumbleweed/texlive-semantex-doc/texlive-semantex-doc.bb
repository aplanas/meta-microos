SUMMARY = "Documentation for texlive-semantex"
DESCRIPTION = "This package includes the documentation for texlive-semantex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.525svn65679"

RPM_NAME = "texlive-semantex-doc-2023.201.0.0.525svn65679-53.1.noarch.rpm"
RPM_HASH = "c7c71eaec4f57be8ae44e53616c9130df84d7ee29040c3a370ebed9d865df80c4b69d70c462b3bb91703306069f7a9c85eb39e08baf9299ae040866ae5291581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantex-doc"
RDEPENDS:${PN} += ""

inherit rpm
