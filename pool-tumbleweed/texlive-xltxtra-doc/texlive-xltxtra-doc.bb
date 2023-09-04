SUMMARY = "Documentation for texlive-xltxtra"
DESCRIPTION = "This package includes the documentation for texlive-xltxtra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn56594"

RPM_NAME = "texlive-xltxtra-doc-2023.209.0.0.7svn56594-53.2.noarch.rpm"
RPM_HASH = "3b47a0d121cc05fcecf14fe217560ec5ac8bb5b5d0672e84dee9cd21a5793bc292066fce313db22190773ea0873645200c6a4b142531b1ed350b44b7d75cd6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
