SUMMARY = "Documentation for texlive-glossaries-dutch"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-doc-2023.209.1.1svn35685-54.2.noarch.rpm"
RPM_HASH = "a23373abf762abf7b4d4a6e81fbdc6ac3e2e2cb9934187f98fafb51cd415a857564c3c32078f7a2df09ff6095a07c2f8c99b85cebe5990620495ed7028f6b9c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
