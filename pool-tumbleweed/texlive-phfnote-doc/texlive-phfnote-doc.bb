SUMMARY = "Documentation for texlive-phfnote"
DESCRIPTION = "This package includes the documentation for texlive-phfnote"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn60733"

RPM_NAME = "texlive-phfnote-doc-2023.201.4.0svn60733-51.1.noarch.rpm"
RPM_HASH = "46c9cfdd10b38c40c9a43ceea903dbb6e014f8197f3a5b640282b2327ad7a5e7da6aef834632291a3e2a7a3e3ac413d5f6fb9efdf9c9929ae988880b6114f9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
