SUMMARY = "Documentation for texlive-staves"
DESCRIPTION = "This package includes the documentation for texlive-staves"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-staves-doc-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "97da9de3977c68ed144fb7c463d317cf7c4c6ecdeb564957877eee19b8208384a7d4541005936c66cf0743b752e99eade00b0acbb631b8d742db43596025001d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-staves-doc"

RDEPENDS:${PN} += ""

inherit rpm
