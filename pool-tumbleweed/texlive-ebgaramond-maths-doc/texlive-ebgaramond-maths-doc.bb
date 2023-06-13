SUMMARY = "Documentation for texlive-ebgaramond-maths"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond-maths"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-doc-2023.201.1.2svn52168-53.1.noarch.rpm"
RPM_HASH = "4358a4fe685e32b64c147620901e2ee8b26c95e088d4a66bffad3bf26a5fc9504b67cade7b26019059886643c1ee354936e613469f1020f688e8789a0307d6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-maths-doc"

RDEPENDS:${PN} += ""

inherit rpm
