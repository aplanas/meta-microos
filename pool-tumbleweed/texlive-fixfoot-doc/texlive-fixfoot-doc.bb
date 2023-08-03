SUMMARY = "Documentation for texlive-fixfoot"
DESCRIPTION = "This package includes the documentation for texlive-fixfoot"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn17131"

RPM_NAME = "texlive-fixfoot-doc-2023.209.0.0.3asvn17131-53.1.noarch.rpm"
RPM_HASH = "30d06a04ed3f27cfcba7bb9d10cf7abf449e9120bb9c7f4a4631b70616d4ae1068855b5df6181a0bbfd24d2446a9f90c174b99e00a07990b83c108da1cb03f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
