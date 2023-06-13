SUMMARY = "Documentation for texlive-chemformula"
DESCRIPTION = "This package includes the documentation for texlive-chemformula"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.17svn61719"

RPM_NAME = "texlive-chemformula-doc-2023.201.4.17svn61719-53.1.noarch.rpm"
RPM_HASH = "89bf3b0e3ed4f9121023a3cccb4da364654d9300ae0397e72e5008bd9efc9d9a6df9cfb2cdca272b2484948515e329d1242293138f520c69e0517e3b568fcf0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemformula-doc"

RDEPENDS:${PN} += ""

inherit rpm
