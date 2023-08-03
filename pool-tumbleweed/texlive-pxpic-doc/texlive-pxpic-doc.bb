SUMMARY = "Documentation for texlive-pxpic"
DESCRIPTION = "This package includes the documentation for texlive-pxpic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65803"

RPM_NAME = "texlive-pxpic-doc-2023.209.1.4svn65803-54.1.noarch.rpm"
RPM_HASH = "623dccbd267d5282cae9e776f19ece0837433c534709284a8fb9d6cde19822e99333b8b9efb62e500fb1415682d3a86b5a140b5c7c0c7e2ad5b5dd5288328d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
