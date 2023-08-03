SUMMARY = "Documentation for texlive-mpostinl"
DESCRIPTION = "This package includes the documentation for texlive-mpostinl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn49559"

RPM_NAME = "texlive-mpostinl-doc-2023.209.1.5svn49559-55.1.noarch.rpm"
RPM_HASH = "3c2861bdf19e496a8e071e1ec0a18523ff39642dfe36b210c33349dd998c9758e1e8f262bd818b75c4e4b343f182e975edef4ce06306ce6321f542b1e040e0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpostinl-doc"

RDEPENDS:${PN} += ""

inherit rpm
