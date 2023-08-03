SUMMARY = "Documentation for texlive-urcls"
DESCRIPTION = "This package includes the documentation for texlive-urcls"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn49903"

RPM_NAME = "texlive-urcls-doc-2023.209.2.1svn49903-54.1.noarch.rpm"
RPM_HASH = "c27099b721d751e75d23f2e1dcc83f5f12b53e545f5d598d17b713399f0f2f3a7335b3e1efcd9f8556d863e588ecc0260c8ddd16ed799cedc2395dfe7a139154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
