SUMMARY = "Documentation for texlive-facture-belge-simple-sans-tva"
DESCRIPTION = "This package includes the documentation for texlive-facture-belge-simple-sans-tva"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn49004"

RPM_NAME = "texlive-facture-belge-simple-sans-tva-doc-2023.209.2.1svn49004-53.1.noarch.rpm"
RPM_HASH = "0239dcbe061c8a2c063cf1e725f59f653996e3235a89c0198b9b0168b828cf148957adf6bbe6e56ac63288de163fbf8a01a00c3483ae96f66b350eceb59cd21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-facture-belge-simple-sans-tva-doc"

RDEPENDS:${PN} += ""

inherit rpm
