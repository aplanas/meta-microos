SUMMARY = "Documentation for texlive-glossaries-french"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-doc-2023.209.1.1svn42873-54.1.noarch.rpm"
RPM_HASH = "e8c13154f7c55f470a624cb75ddb07ef7b9009cf3071cd65dc58001298153de453d21d136a86809a7e4338a4ac271a7e0700a4936fcd0131fb50977ada323587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
