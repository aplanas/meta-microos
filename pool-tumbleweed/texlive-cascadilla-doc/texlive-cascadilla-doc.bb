SUMMARY = "Documentation for texlive-cascadilla"
DESCRIPTION = "This package includes the documentation for texlive-cascadilla"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.2svn25144"

RPM_NAME = "texlive-cascadilla-doc-2023.209.1.8.2svn25144-53.1.noarch.rpm"
RPM_HASH = "689583431a00385db0571bd57eb1b7b4d271576c7061072825d2aa6d6a5276869d318e81e75b374199ed728f56d829ed3cd9b1246582001bf318608ad71e7016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadilla-doc"

RDEPENDS:${PN} += ""

inherit rpm
