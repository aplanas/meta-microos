SUMMARY = "Documentation for texlive-pdfpc"
DESCRIPTION = "This package includes the documentation for texlive-pdfpc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7.0svn63866"

RPM_NAME = "texlive-pdfpc-doc-2023.201.0.0.7.0svn63866-51.1.noarch.rpm"
RPM_HASH = "618b7e8ed621c1f279c555524d1bce86518ddaa5d6835c6e023054e60fbf63c1d63a5eb610861ffa58b38349e3dc6b57043973d480d945d9e18e2f3e1139e622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
