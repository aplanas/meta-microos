SUMMARY = "Documentation for texlive-pstool"
DESCRIPTION = "This package includes the documentation for texlive-pstool"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn46393"

RPM_NAME = "texlive-pstool-doc-2023.209.1.5esvn46393-54.1.noarch.rpm"
RPM_HASH = "8b4d1f47a3489b2ae3b4d470a143bfec987322dc88bd8d2cffd614e310e13c6321b4421e0ef7b4dd76d534786c879118b4e360b600c481df536aacc3d76decc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstool-doc"

RDEPENDS:${PN} += ""

inherit rpm
