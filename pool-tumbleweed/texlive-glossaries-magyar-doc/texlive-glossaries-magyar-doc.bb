SUMMARY = "Documentation for texlive-glossaries-magyar"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-magyar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "ef3cc94d140a5c07d5bd43308c558167c20fbd0603387c40227f6cc41b5b39a2f6914457fb906261e7b7dfac2318bbe9a7eda95e28671859dbb64b7790205d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
