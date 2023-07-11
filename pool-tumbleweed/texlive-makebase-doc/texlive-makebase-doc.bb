SUMMARY = "Documentation for texlive-makebase"
DESCRIPTION = "This package includes the documentation for texlive-makebase"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn41012"

RPM_NAME = "texlive-makebase-doc-2023.208.0.0.2svn41012-53.1.noarch.rpm"
RPM_HASH = "04a6b4dfe351535a21287afd4b91dd3fb970541961548865533dd158359391ddcd0cf434306f41c8a3a76dd515d918416fe8ce2556f7bbaeef52f13aac0f5897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebase-doc"

RDEPENDS:${PN} += ""

inherit rpm
