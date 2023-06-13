SUMMARY = "Documentation for texlive-flashmovie"
DESCRIPTION = "This package includes the documentation for texlive-flashmovie"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn25768"

RPM_NAME = "texlive-flashmovie-doc-2023.201.0.0.4svn25768-52.1.noarch.rpm"
RPM_HASH = "ec72d48f80af1aaa47dc08d024f5a0b452f0b4d765eab3bf48d0d8deeab0ca2c584a89ebbe957290716cbc2dca9ded36d9532e43fbab7b1d3084d136fa72b9a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flashmovie-doc"

RDEPENDS:${PN} += ""

inherit rpm
