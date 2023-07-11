SUMMARY = "Documentation for texlive-edfnotes"
DESCRIPTION = "This package includes the documentation for texlive-edfnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-doc-2023.201.0.0.6bsvn21540-53.2.noarch.rpm"
RPM_HASH = "e8a5f9dff0ab3c8b721b438e8c02b0360d8885d5f5b8c78b3e0f7bf820a9866f609c81026e17f64cacbc3a5ef387bbe523d3e7bfe4994f975d9a89e5fa5be246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edfnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
