SUMMARY = "Documentation for texlive-eemeir"
DESCRIPTION = "This package includes the documentation for texlive-eemeir"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-doc-2023.201.1.1bsvn15878-53.2.noarch.rpm"
RPM_HASH = "fcf4389afb25874a57cbf18273602a6f5df7b35b70211c7df60f99cfba72d8a5e1f4a2146925f261c65ea51b756ccca3ee229ee9386a4a90919ba6dda233ac40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eemeir-doc"

RDEPENDS:${PN} += ""

inherit rpm
