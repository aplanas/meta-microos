SUMMARY = "Documentation for texlive-glossaries-german"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "52c5a7027fddba18da6a00d7f2df8aa6a9a990569028803a7df33a17c84a43fd21a6a8639ed295191e23a3160bdc54892fb52818b2501addb8b384948b3d7be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
