SUMMARY = "Documentation for texlive-glossaries-serbian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "2516391f283681c95174378239ac4e4bcbedc5e0ff86260d1fc320e62a8e2f37d2b2b6582a83223beff16f91e5026d44fde481f510fb73c784863e4ba1b38331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
