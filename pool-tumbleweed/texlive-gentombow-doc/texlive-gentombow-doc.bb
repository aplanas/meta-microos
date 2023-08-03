SUMMARY = "Documentation for texlive-gentombow"
DESCRIPTION = "This package includes the documentation for texlive-gentombow"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64333"

RPM_NAME = "texlive-gentombow-doc-2023.209.svn64333-53.1.noarch.rpm"
RPM_HASH = "9a3dbd97f6a4af0d5184e339ecc7cb2e1c149360a43d897c9c8438b9ce1e88836379d5a6b4a0afbdf0e49790bcd26070b5fbde0810329850fafab85038930b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gentombow-doc-ja \
texlive-gentombow-doc"

RDEPENDS:${PN} += ""

inherit rpm
