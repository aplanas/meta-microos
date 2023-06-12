SUMMARY = "Documentation for texlive-biblatex-jura2"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-jura2"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64762"

RPM_NAME = "texlive-biblatex-jura2-doc-2023.201.0.0.5svn64762-53.1.noarch.rpm"
RPM_HASH = "d8df7ec919ba462c3e12168c8c7471d53b3291e5b3da71836e9421dfe7e562e18dfbbc5c193b5722f35257b3acebdc1561a47eaa9d2d603bd058c9d031e4f3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-jura2-doc:de) \
texlive-biblatex-jura2-doc"
RDEPENDS:${PN} += ""

inherit rpm
