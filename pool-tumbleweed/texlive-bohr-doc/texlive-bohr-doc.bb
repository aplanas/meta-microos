SUMMARY = "Documentation for texlive-bohr"
DESCRIPTION = "This package includes the documentation for texlive-bohr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62977"

RPM_NAME = "texlive-bohr-doc-2023.209.1.0svn62977-53.1.noarch.rpm"
RPM_HASH = "9bbd698a8fc14031522e62ffbcff6e016e973aed002f8580e903fb753457660466e3d9690dd56e3c28b0288384ced107cf3b805bf840c614e91e6e09486c458e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bohr-doc"

RDEPENDS:${PN} += ""

inherit rpm
