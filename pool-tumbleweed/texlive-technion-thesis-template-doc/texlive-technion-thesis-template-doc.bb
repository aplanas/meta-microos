SUMMARY = "Documentation for texlive-technion-thesis-template"
DESCRIPTION = "This package includes the documentation for texlive-technion-thesis-template"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49889"

RPM_NAME = "texlive-technion-thesis-template-doc-2023.209.1.0svn49889-55.1.noarch.rpm"
RPM_HASH = "1c82929cfc661bf33268a499f737ebb695fe4ae1f678261b4c204965beba5d7742c66342e4bf97c0d0e2922d1c72e64a5721528cb10b56c816266787cee46d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-technion-thesis-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
