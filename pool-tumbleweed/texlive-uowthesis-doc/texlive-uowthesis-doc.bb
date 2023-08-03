SUMMARY = "Documentation for texlive-uowthesis"
DESCRIPTION = "This package includes the documentation for texlive-uowthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn19700"

RPM_NAME = "texlive-uowthesis-doc-2023.209.1.0asvn19700-54.1.noarch.rpm"
RPM_HASH = "e77f358fe43e524f865153987b54a07a2caca38cf267f0660a22fc680c212d9ed8e476b627480b6f410688fdc359bc656b598f08d8d3e2b274ba92f60bdc944d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uowthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
