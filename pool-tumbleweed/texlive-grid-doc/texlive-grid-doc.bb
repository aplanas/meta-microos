SUMMARY = "Documentation for texlive-grid"
DESCRIPTION = "This package includes the documentation for texlive-grid"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-grid-doc-2023.201.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "6fa34c20fac0d9c12dbbe4fe179f99123af178658eb4b7759bc381974ff985ef94dcb3e5b9dd90ee45dd8f266bfea1df1608376f20edbdf52b3d13f2c4f05cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-doc"

RDEPENDS:${PN} += ""

inherit rpm
