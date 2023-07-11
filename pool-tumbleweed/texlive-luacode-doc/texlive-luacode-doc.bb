SUMMARY = "Documentation for texlive-luacode"
DESCRIPTION = "This package includes the documentation for texlive-luacode"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2asvn25193"

RPM_NAME = "texlive-luacode-doc-2023.208.1.2asvn25193-53.1.noarch.rpm"
RPM_HASH = "4688c96196fe7bc296082ab93011a5bb6127ab7717d7565e77a3b7abf1a28e7998bf26662c30ddf6cbb7f973eeab622aead8ea68fd15bcf68bca3c2f66259cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacode-doc"

RDEPENDS:${PN} += ""

inherit rpm
