SUMMARY = "Documentation for texlive-uebungsblatt"
DESCRIPTION = "This package includes the documentation for texlive-uebungsblatt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.0svn15878"

RPM_NAME = "texlive-uebungsblatt-doc-2023.209.1.5.0svn15878-54.1.noarch.rpm"
RPM_HASH = "2ff7d064c20acbe222f13fc923767ae9b329b8bc3ffa13c021de1a822ac1bde4bf46a6c3b3cc7574d8be92267057ae5d1167a8de83a046f4f1419615ff16142e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uebungsblatt-doc-de \
texlive-uebungsblatt-doc"

RDEPENDS:${PN} += ""

inherit rpm
