SUMMARY = "Documentation for texlive-gmverse"
DESCRIPTION = "This package includes the documentation for texlive-gmverse"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-doc-2023.209.0.0.73svn29803-54.1.noarch.rpm"
RPM_HASH = "fad3adbbfb841af8e2f23961764f330d2f31a3f2d46e0351e51cb26a973e559e27e21c01cb03a60b027d3ee4cf8dd25dd5a7641ac86c06379b80178ef8828b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverse-doc"

RDEPENDS:${PN} += ""

inherit rpm
