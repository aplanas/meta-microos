SUMMARY = "Documentation for texlive-facture"
DESCRIPTION = "This package includes the documentation for texlive-facture"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn43865"

RPM_NAME = "texlive-facture-doc-2023.209.1.2.2svn43865-53.1.noarch.rpm"
RPM_HASH = "3e8be5abce127c7d3afc83ab2511e0cb80689f2bf8c2a909b5f6b2545fbc7a69ac2c3279743e0033e28636da8b5f1f90de788a53aedcfb024c4c1def1f8a1446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-facture-doc-fr \
texlive-facture-doc"

RDEPENDS:${PN} += ""

inherit rpm
