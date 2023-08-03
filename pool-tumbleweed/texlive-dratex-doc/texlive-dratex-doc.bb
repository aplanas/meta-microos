SUMMARY = "Documentation for texlive-dratex"
DESCRIPTION = "This package includes the documentation for texlive-dratex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-dratex-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "55ef97ec9130f092a3a28fbf617241d0b7a735ac3a771de8a6d17fc28e44fe8ea6c4d49d51a9a0ab3080f80e63c965b912a0cd2357e129b1012a4e7bc6120977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dratex-doc"

RDEPENDS:${PN} += ""

inherit rpm
