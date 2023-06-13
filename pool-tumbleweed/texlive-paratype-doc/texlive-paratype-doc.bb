SUMMARY = "Documentation for texlive-paratype"
DESCRIPTION = "This package includes the documentation for texlive-paratype"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32859"

RPM_NAME = "texlive-paratype-doc-2023.201.svn32859-51.1.noarch.rpm"
RPM_HASH = "4de78b21713277a4c7c07787d9fd984a5df039c375fb73a3c8e57fa5cf3be2f91d56957871ecca905cdc241d8fa3577174dcd436b9a0d937e5ffb512eb031419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paratype-doc"

RDEPENDS:${PN} += ""

inherit rpm
