SUMMARY = "Documentation for texlive-asapsym"
DESCRIPTION = "This package includes the documentation for texlive-asapsym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn40201"

RPM_NAME = "texlive-asapsym-doc-2023.201.1.0svn40201-53.1.noarch.rpm"
RPM_HASH = "b45ac04456336b361e962b5099903571d4be0edd3bf569442a69e3dceb6b0e5adec979aa93ba2ea3088647eb251457bf25f71261524aaab5c56760810782bc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asapsym-doc"
RDEPENDS:${PN} += ""

inherit rpm
