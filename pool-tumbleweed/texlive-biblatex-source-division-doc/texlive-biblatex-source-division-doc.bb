SUMMARY = "Documentation for texlive-biblatex-source-division"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-source-division"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4.2svn45379"

RPM_NAME = "texlive-biblatex-source-division-doc-2023.201.2.4.2svn45379-53.1.noarch.rpm"
RPM_HASH = "476af3c4b76814d9b9d1d5f86e7a650bf6cea345017f7971dfc6ab81e47cee3527c0ee83d6bd5a88ae25ec3ecf995e088404918bb1626e56c3278160478c3289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-source-division-doc"
RDEPENDS:${PN} += ""

inherit rpm
