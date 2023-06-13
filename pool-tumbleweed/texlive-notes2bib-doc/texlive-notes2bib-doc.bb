SUMMARY = "Documentation for texlive-notes2bib"
DESCRIPTION = "This package includes the documentation for texlive-notes2bib"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0msvn52231"

RPM_NAME = "texlive-notes2bib-doc-2023.201.2.0msvn52231-54.1.noarch.rpm"
RPM_HASH = "864bc577c693b27022d2c605134ca58e7bb2e3487c9fc54e0075b9a3a4b56dcfb241b0c2d36ffad217d0b17c6df905391bd070e4e7e1881fbadd2d141707a7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notes2bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
