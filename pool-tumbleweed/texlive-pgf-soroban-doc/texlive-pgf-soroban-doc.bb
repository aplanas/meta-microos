SUMMARY = "Documentation for texlive-pgf-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pgf-soroban"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32269"

RPM_NAME = "texlive-pgf-soroban-doc-2023.209.1.1svn32269-52.1.noarch.rpm"
RPM_HASH = "062493e36db082492325cfd223cf2602d7946ebc1d30a343f59237cb3b311c398a761a2f462f3e773e3659536b201aeabdebac969b0fd192ac2a2858401b54c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
