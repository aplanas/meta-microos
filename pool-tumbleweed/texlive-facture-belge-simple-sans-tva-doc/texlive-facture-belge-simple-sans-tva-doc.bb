SUMMARY = "Documentation for texlive-facture-belge-simple-sans-tva"
DESCRIPTION = "This package includes the documentation for texlive-facture-belge-simple-sans-tva"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn49004"

RPM_NAME = "texlive-facture-belge-simple-sans-tva-doc-2023.201.2.1svn49004-52.1.noarch.rpm"
RPM_HASH = "0dead25d9d352fa2221d76691bda9b72f8d4b1fe3e388e35b533b69bd84fbc047774f70cdec1a34efde39c5a8e1094a4cfc6c43a35b99e6b83be98fab4f3b01b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-facture-belge-simple-sans-tva-doc"

RDEPENDS:${PN} += ""

inherit rpm
