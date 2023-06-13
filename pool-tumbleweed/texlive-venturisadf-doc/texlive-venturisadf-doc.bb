SUMMARY = "Documentation for texlive-venturisadf"
DESCRIPTION = "This package includes the documentation for texlive-venturisadf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.005svn19444"

RPM_NAME = "texlive-venturisadf-doc-2023.201.1.005svn19444-53.1.noarch.rpm"
RPM_HASH = "4af37584ab71f4ba0cbb3e1c5e56bbd97d1e4b18bc8b3fc6ea888b86c3101272789b21a1ee545d2172170bd9a2151558f68d27c20292b7ec7f7818acefa70d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venturisadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
