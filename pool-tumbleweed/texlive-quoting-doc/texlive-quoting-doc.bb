SUMMARY = "Documentation for texlive-quoting"
DESCRIPTION = "This package includes the documentation for texlive-quoting"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn32818"

RPM_NAME = "texlive-quoting-doc-2023.201.0.0.1csvn32818-53.1.noarch.rpm"
RPM_HASH = "a52249477010921fa29a7456ef401096d7de57e65ce1147c09c8183f635aa2bacfc6e52ae15a6951d8a2bde3cda4ad8b08e897ef49fc92c71d024ba7d3f33dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quoting-doc"

RDEPENDS:${PN} += ""

inherit rpm
