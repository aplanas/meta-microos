SUMMARY = "Documentation for texlive-glossaries-magyar"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-magyar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "74175c8f6fdfbf3a45696e326a8e90f1ff51f28a63eb46e6e073a5566e295a549ec3065184355237fc852461e0a7513adfd06d890cca4b49a6b7cac8c35e4d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
