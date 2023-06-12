SUMMARY = "Documentation for texlive-trivfloat"
DESCRIPTION = "This package includes the documentation for texlive-trivfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3bsvn15878"

RPM_NAME = "texlive-trivfloat-doc-2023.201.1.3bsvn15878-52.1.noarch.rpm"
RPM_HASH = "ff788828c8b2480c1aae3c197fe57c5ca2afc16470138bf28a5f3f74ef13f0436a276f639904d865972c31491ff2d9c334b9b149a89e550d9c87d5c14b5e2f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trivfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
