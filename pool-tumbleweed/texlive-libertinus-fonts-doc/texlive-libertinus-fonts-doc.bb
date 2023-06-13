SUMMARY = "Documentation for texlive-libertinus-fonts"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-fonts"
LICENSE = "OFL-1.1"

PV = "2023.201.7.040svn57948"

RPM_NAME = "texlive-libertinus-fonts-doc-2023.201.7.040svn57948-54.1.noarch.rpm"
RPM_HASH = "786a49209ed01d4614cceaec01328d2a4af5d44db1d4b1705a1e65fc338ec9483b025fa8ae53f8ee68bbd0e0d58ef919b173098522b30377586fe4da1bdd586b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
