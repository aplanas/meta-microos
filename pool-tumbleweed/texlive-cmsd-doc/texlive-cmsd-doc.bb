SUMMARY = "Documentation for texlive-cmsd"
DESCRIPTION = "This package includes the documentation for texlive-cmsd"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18787"

RPM_NAME = "texlive-cmsd-doc-2023.209.svn18787-54.1.noarch.rpm"
RPM_HASH = "86964c132cea7faa00b061f3ed8c632e4e2ef07a2dc36483f2b7ca995f12e4dfafca97bda5ffa9fd61efb1ee728a33daa5c43525343518083b36b6e89fe92d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
