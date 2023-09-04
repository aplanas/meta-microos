SUMMARY = "Documentation for texlive-gitver"
DESCRIPTION = "This package includes the documentation for texlive-gitver"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63920"

RPM_NAME = "texlive-gitver-doc-2023.209.1.4svn63920-54.2.noarch.rpm"
RPM_HASH = "776464c8ac49276233660d0888baa632c700f8b273820e490cd4f17e2890e523faded0990dfcef9b7df03fca8de2b6b91df6977aae9049e50c707a49d2c1bb2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitver-doc"

RDEPENDS:${PN} += ""

inherit rpm
