SUMMARY = "Documentation for texlive-berenisadf"
DESCRIPTION = "This package includes the documentation for texlive-berenisadf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.004svn32215"

RPM_NAME = "texlive-berenisadf-doc-2023.209.1.004svn32215-54.1.noarch.rpm"
RPM_HASH = "71235ef8bfa5754c7a6e689874ea8ab071f3b99b410d609e63151d741e6a5410fec23b372492c811a699f1234840f16a1a4f9de4494000dd68a4d065a6264123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-berenisadf-doc"

RDEPENDS:${PN} += "/usr/bin/fontforge"

inherit rpm
