SUMMARY = "Documentation for texlive-txuprcal"
DESCRIPTION = "This package includes the documentation for texlive-txuprcal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.00svn43327"

RPM_NAME = "texlive-txuprcal-doc-2023.201.1.00svn43327-52.1.noarch.rpm"
RPM_HASH = "3a70212e4138ecdeff119713f0ebbf6cde197bcbece0d48eb1ca984c89c96b0335cedc4f8791d3cbac80ebbc33ba9d4f1bb124a9bb66483543cb96fd280c914f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txuprcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
