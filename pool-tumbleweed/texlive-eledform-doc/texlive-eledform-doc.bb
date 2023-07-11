SUMMARY = "Documentation for texlive-eledform"
DESCRIPTION = "This package includes the documentation for texlive-eledform"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38114"

RPM_NAME = "texlive-eledform-doc-2023.201.1.1asvn38114-53.2.noarch.rpm"
RPM_HASH = "711d07c699378ff93fd7d06736512baa58ad66ea0eaacda63eda624bd3cbc6ea058c712df7321e6bf03a3d0cac51d9a4473f23e7293cb7354b2e7d4debc3643c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledform-doc"

RDEPENDS:${PN} += ""

inherit rpm
