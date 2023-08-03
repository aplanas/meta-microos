SUMMARY = "Documentation for texlive-parnotes"
DESCRIPTION = "This package includes the documentation for texlive-parnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.3bsvn51720"

RPM_NAME = "texlive-parnotes-doc-2023.209.3bsvn51720-52.1.noarch.rpm"
RPM_HASH = "a4d53abaef1164d42235a996ddf4ec32e54f10b92d00798fb5ea89a788a6018f3d25e7d680b5a2851ec9f6951d08da682ba4ff8394dd46a4cf6b573acee6b2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
