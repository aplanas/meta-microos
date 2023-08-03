SUMMARY = "Documentation for texlive-everyshi"
DESCRIPTION = "This package includes the documentation for texlive-everyshi"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.00svn57001"

RPM_NAME = "texlive-everyshi-doc-2023.209.4.00svn57001-53.1.noarch.rpm"
RPM_HASH = "2c971d1def9cd4256056b330ebe4e97d8a15b403121d6e4e3e44fc2676524f7919cc66c8784879eddbff3c43bf15f6a28c811e7a8400463aa66ede8e4ac065b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everyshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
