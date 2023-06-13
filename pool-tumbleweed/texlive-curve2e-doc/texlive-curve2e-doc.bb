SUMMARY = "Documentation for texlive-curve2e"
DESCRIPTION = "This package includes the documentation for texlive-curve2e"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.2.22svn65469"

RPM_NAME = "texlive-curve2e-doc-2023.204.2.2.22svn65469-54.1.noarch.rpm"
RPM_HASH = "a3763ac449afc3a171536ba8f8e47ffaf4091096a09acfa4ff6733dee6feb24eb22c60e631977eb8dcab8b7fbe2b9b40530e95dd6113a83d580da61ce33ec004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curve2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
