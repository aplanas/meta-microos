SUMMARY = "Documentation for texlive-revtex4-1"
DESCRIPTION = "This package includes the documentation for texlive-revtex4-1"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-doc-2023.209.4.1ssvn56590-54.1.noarch.rpm"
RPM_HASH = "56a98f9f3b7b638b137c381ca911a5847ed0295c0525fbae976079de869f4dd7217757ebfdd82ef837ccbdd9387d68b4db8fedd54cb8d4feeb18bf0ce7a7303c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-1-doc"

RDEPENDS:${PN} += ""

inherit rpm
