SUMMARY = "Documentation for texlive-edfnotes"
DESCRIPTION = "This package includes the documentation for texlive-edfnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-doc-2023.209.0.0.6bsvn21540-54.1.noarch.rpm"
RPM_HASH = "493efb22b6ed4adc09a21443ba5d42908547894c47c30f3d5d5dbec521a4cae2ede37773eb906d1e798a3fb11261e4b3ff6321644d7e672c8d1562c413eaed10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edfnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
