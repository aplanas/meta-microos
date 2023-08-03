SUMMARY = "Documentation for texlive-bpchem"
DESCRIPTION = "This package includes the documentation for texlive-bpchem"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn45120"

RPM_NAME = "texlive-bpchem-doc-2023.209.1.1svn45120-53.1.noarch.rpm"
RPM_HASH = "c55114a1172f9d03be9f1ab06a6c16b2440f59f18f95d17fb6a9e8a6fdb75a3519b77c45a1ac19b9893198b81c31fcc9a235c4106a703352c4285f559b9ffe51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpchem-doc"

RDEPENDS:${PN} += ""

inherit rpm
