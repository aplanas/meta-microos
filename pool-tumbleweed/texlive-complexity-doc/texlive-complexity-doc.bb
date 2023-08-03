SUMMARY = "Documentation for texlive-complexity"
DESCRIPTION = "This package includes the documentation for texlive-complexity"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.81asvn45322"

RPM_NAME = "texlive-complexity-doc-2023.209.0.0.81asvn45322-54.1.noarch.rpm"
RPM_HASH = "c53a3ad94cfc79451e1fd6d7a2327fc83deb3ce92d1d25cc3a39755f5c54a7f2d8a9394bd3dce36576fea342babafff226c284c6b48d2526a5323fe16ada43e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-complexity-doc"

RDEPENDS:${PN} += ""

inherit rpm
