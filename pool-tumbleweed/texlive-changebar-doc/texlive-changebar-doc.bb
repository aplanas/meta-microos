SUMMARY = "Documentation for texlive-changebar"
DESCRIPTION = "This package includes the documentation for texlive-changebar"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6dsvn63259"

RPM_NAME = "texlive-changebar-doc-2023.209.3.6dsvn63259-53.1.noarch.rpm"
RPM_HASH = "27e07bfe3f15c9cc0a34edbf9f4b790dbe6919081623ba14f5d7d496c0c40ef77f4c42103e955c83afad07bd6494f8fe87a3fb88a5ebad0b69a970c9740a47f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
