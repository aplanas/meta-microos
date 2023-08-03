SUMMARY = "Documentation for texlive-bewerbung"
DESCRIPTION = "This package includes the documentation for texlive-bewerbung"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61632"

RPM_NAME = "texlive-bewerbung-doc-2023.209.1.3svn61632-54.1.noarch.rpm"
RPM_HASH = "54d24e3a56446fe322853ee20b4e7d9e44560fefeec21202f9914383da83e95033e854f37bbaa381602e97be6ca31e22ca9c51f1b561a80b1afbe6316bc2009f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-bewerbung-doc-de;de \
texlive-bewerbung-doc"

RDEPENDS:${PN} += ""

inherit rpm
