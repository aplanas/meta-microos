SUMMARY = "Documentation for texlive-tablists"
DESCRIPTION = "This package includes the documentation for texlive-tablists"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0esvn15878"

RPM_NAME = "texlive-tablists-doc-2023.209.0.0.0esvn15878-55.1.noarch.rpm"
RPM_HASH = "a087ff86d1ac4736551936cba5de0d5774f2185b49be3ec1ef558bde4fb02d1c9577defeb1ef2e69b365e617020d8c0e89ee2b294ca2ba2ecb11087b6dd43816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablists-doc"

RDEPENDS:${PN} += ""

inherit rpm
