SUMMARY = "Documentation for texlive-gensymb"
DESCRIPTION = "This package includes the documentation for texlive-gensymb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn64740"

RPM_NAME = "texlive-gensymb-doc-2023.201.1.0.2svn64740-52.1.noarch.rpm"
RPM_HASH = "8fd1cf63f8131c648329004ddd465db2017e9d2c9f6f7378c0ff09e6d3a25b1e7505278b8dce368feef3bc87d8624fb8014b233a9925d93c5874e966c50b928e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gensymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
