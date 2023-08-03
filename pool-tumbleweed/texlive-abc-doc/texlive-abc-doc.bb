SUMMARY = "Documentation for texlive-abc"
DESCRIPTION = "This package includes the documentation for texlive-abc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn41157"

RPM_NAME = "texlive-abc-doc-2023.209.2.0bsvn41157-55.1.noarch.rpm"
RPM_HASH = "5225aa92a3b85a9c96771a62ab311976af9ca02868cdead2bcd20c4f5824299c1a1b48309fc250b87ddd267e0f10f94196896fada8baf456c569b71e828b167f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abc-doc"

RDEPENDS:${PN} += ""

inherit rpm
