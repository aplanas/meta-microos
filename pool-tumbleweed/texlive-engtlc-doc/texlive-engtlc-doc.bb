SUMMARY = "Documentation for texlive-engtlc"
DESCRIPTION = "This package includes the documentation for texlive-engtlc"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn28571"

RPM_NAME = "texlive-engtlc-doc-2023.209.3.2svn28571-54.1.noarch.rpm"
RPM_HASH = "a8c64ca2a193ae0c3a3c0a8866310cd60e5a13bce1553d2cd119f6ee2bdfdb7cc7733a2279db7aa8eeaf77f972a1ad27794a7d4ee58fe17fc7675e608ccf08a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engtlc-doc-en;it \
texlive-engtlc-doc"

RDEPENDS:${PN} += ""

inherit rpm
