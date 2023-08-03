SUMMARY = "Documentation for texlive-biolett-bst"
DESCRIPTION = "This package includes the documentation for texlive-biolett-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-biolett-bst-doc-2023.209.svn66115-53.1.noarch.rpm"
RPM_HASH = "ccfab4e624b66267a79f605ec11e133814c5f5d0a711d6a426bf20361f914dc319e17605d71e037895e7d3f8e571aac88fc5a8b3400899bcc162961eae00c95b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biolett-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
