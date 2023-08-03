SUMMARY = "Documentation for texlive-phfquotetext"
DESCRIPTION = "This package includes the documentation for texlive-phfquotetext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41869"

RPM_NAME = "texlive-phfquotetext-doc-2023.209.1.0svn41869-52.1.noarch.rpm"
RPM_HASH = "96b7c2c398b8105ec09df09eb3a57372ebc45ec5d64bb6ba5783569d80aac08c9241e520ffcc99e5ad372465a638df132862d89b285f12d05f8ff1e0f063cf6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfquotetext-doc"

RDEPENDS:${PN} += ""

inherit rpm
