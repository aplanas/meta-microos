SUMMARY = "Documentation for texlive-augie"
DESCRIPTION = "This package includes the documentation for texlive-augie"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-augie-doc-2023.209.svn61719-54.1.noarch.rpm"
RPM_HASH = "cbf9009b46a0b3ae5b1b240267e5309bde596e1f174f95881b1dc4ad1b81c5e4041860972f44d777b79655cdcc3ddb41e413e460947da6ce3cd92af5a91e5e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-augie-doc"

RDEPENDS:${PN} += ""

inherit rpm
