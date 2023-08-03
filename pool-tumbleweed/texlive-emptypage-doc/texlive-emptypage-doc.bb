SUMMARY = "Documentation for texlive-emptypage"
DESCRIPTION = "This package includes the documentation for texlive-emptypage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18064"

RPM_NAME = "texlive-emptypage-doc-2023.209.1.2svn18064-54.1.noarch.rpm"
RPM_HASH = "cce4dde2aaf91d4dbd93113547efb324629d2bdf59666d3b98e8b2c7fc8206a55869dca046b349d3867f5e10697997e2ec66f26bf6f92ebd855e1ef97c7bb129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emptypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
