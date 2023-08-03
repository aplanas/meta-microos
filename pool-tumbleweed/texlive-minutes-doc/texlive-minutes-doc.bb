SUMMARY = "Documentation for texlive-minutes"
DESCRIPTION = "This package includes the documentation for texlive-minutes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8fsvn42186"

RPM_NAME = "texlive-minutes-doc-2023.209.1.8fsvn42186-55.1.noarch.rpm"
RPM_HASH = "bc584cd9675b01f9d6be38f37bca28ea6262a36fa7c218177f95e9d0f0e0ec1971252d11ff7a54193cc4d18f936d0b4f5d73c9c81c78a26703176f962c3fa098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minutes-doc"

RDEPENDS:${PN} += ""

inherit rpm
