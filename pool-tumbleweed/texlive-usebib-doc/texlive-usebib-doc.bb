SUMMARY = "Documentation for texlive-usebib"
DESCRIPTION = "This package includes the documentation for texlive-usebib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn25969"

RPM_NAME = "texlive-usebib-doc-2023.201.1.0asvn25969-53.1.noarch.rpm"
RPM_HASH = "e17b955ef593d24cb6570da9346dd343737d9740e9be9994e0a5c682a5d3e11feac8b30d03acca74dafe4dfb8b9b0210d828b273859b73bd0bed6a0060894ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-usebib-doc"
RDEPENDS:${PN} += ""

inherit rpm
