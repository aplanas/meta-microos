SUMMARY = "Documentation for texlive-genealogytree"
DESCRIPTION = "This package includes the documentation for texlive-genealogytree"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn66513"

RPM_NAME = "texlive-genealogytree-doc-2023.209.2.3.0svn66513-53.1.noarch.rpm"
RPM_HASH = "eb110d5638809bb985e0944ee03df7072ce24220db7f931b57e09a8d8518034a93ab3c6b3b4f97f761e457401ecb34abc14a08a6c3a0c2a448753a6cf320c71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
