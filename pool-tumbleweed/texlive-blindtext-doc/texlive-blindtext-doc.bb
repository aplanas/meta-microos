SUMMARY = "Documentation for texlive-blindtext"
DESCRIPTION = "This package includes the documentation for texlive-blindtext"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn25039"

RPM_NAME = "texlive-blindtext-doc-2023.209.2.0svn25039-53.1.noarch.rpm"
RPM_HASH = "f209cd9f751799448a77d434d507c87ebe4d078964301f131147a3a39ccb48e720346b341115a01f7e4d813ed1aca0b3d29f6789997df2113632dc3438910c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blindtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
