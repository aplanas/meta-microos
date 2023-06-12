SUMMARY = "Documentation for texlive-babel-sorbian"
DESCRIPTION = "This package includes the documentation for texlive-babel-sorbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0jsvn60975"

RPM_NAME = "texlive-babel-sorbian-doc-2023.201.1.0jsvn60975-53.1.noarch.rpm"
RPM_HASH = "0dfae528f869280b60b59243fca7b11e7320716c07d04b05a02d305ff8040dadb8588ebeedb73f157e92f2c654d64ae12a3d59cc28e665eb4f9476d177df3afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-sorbian-doc"
RDEPENDS:${PN} += ""

inherit rpm
