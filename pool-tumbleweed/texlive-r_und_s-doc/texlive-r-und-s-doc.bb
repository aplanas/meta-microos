SUMMARY = "Documentation for texlive-r_und_s"
DESCRIPTION = "This package includes the documentation for texlive-r_und_s"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-doc-2023.201.1.3isvn15878-53.2.noarch.rpm"
RPM_HASH = "1106c3fda5f34cd5713991eec99f9d2b70cc45505cd888cf7a6b54a5e526435ed2dd3a83d13b307287e11148dc1c67af13bf69067c816c661af2b5bb7fd86103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-r-und-s-doc"

RDEPENDS:${PN} += ""

inherit rpm
