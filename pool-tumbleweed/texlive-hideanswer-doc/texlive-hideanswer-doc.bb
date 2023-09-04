SUMMARY = "Documentation for texlive-hideanswer"
DESCRIPTION = "This package includes the documentation for texlive-hideanswer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63852"

RPM_NAME = "texlive-hideanswer-doc-2023.209.1.1svn63852-54.2.noarch.rpm"
RPM_HASH = "caef795778a798a6680380a2ea01c5594961c5a0ed7cd02c03833598c548320c3be8a08eeca309d61bd677bfadb594fb6d501aebb90c4631c6ff9103b727ede6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hideanswer-doc"

RDEPENDS:${PN} += ""

inherit rpm
