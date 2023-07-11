SUMMARY = "Documentation for texlive-lyluatex"
DESCRIPTION = "This package includes the documentation for texlive-lyluatex"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1.3svn66278"

RPM_NAME = "texlive-lyluatex-doc-2023.208.1.1.3svn66278-53.1.noarch.rpm"
RPM_HASH = "e65894f6506a7b65e31097b5e3c566d6b82208edb63a67255a822e5c93435e8ffae1d40e68fc4e1735c0246b662b89e50d87ce2b5f1b099274b22772f2c5e5b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lyluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
