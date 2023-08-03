SUMMARY = "Documentation for texlive-float"
DESCRIPTION = "This package includes the documentation for texlive-float"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3dsvn15878"

RPM_NAME = "texlive-float-doc-2023.209.1.3dsvn15878-53.1.noarch.rpm"
RPM_HASH = "79017134d0ecae22938c876165cdc2532244edb88d6fdc4ffecfe4580c15d2c93bdc25f66dfa30b67b916da4f5feb9e6c05620bf43bd99f341db5e0da76c1bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-float-doc"

RDEPENDS:${PN} += ""

inherit rpm
