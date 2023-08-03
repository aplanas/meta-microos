SUMMARY = "Documentation for texlive-chembst"
DESCRIPTION = "This package includes the documentation for texlive-chembst"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.5svn15878"

RPM_NAME = "texlive-chembst-doc-2023.209.0.0.2.5svn15878-54.1.noarch.rpm"
RPM_HASH = "e777f33c9a1abddfb15df21b68cf787ccaaee318e5fa5a87418049ce7544c5f1dfc39548530b28bf67807ed182dd968d2e58dbc788e76543259ec717550953b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chembst-doc"

RDEPENDS:${PN} += ""

inherit rpm
