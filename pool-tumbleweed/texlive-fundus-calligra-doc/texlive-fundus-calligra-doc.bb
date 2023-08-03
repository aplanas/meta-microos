SUMMARY = "Documentation for texlive-fundus-calligra"
DESCRIPTION = "This package includes the documentation for texlive-fundus-calligra"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn26018"

RPM_NAME = "texlive-fundus-calligra-doc-2023.209.1.2svn26018-53.1.noarch.rpm"
RPM_HASH = "690568063d069f3c7e342ea55b26f671b31a915216a5286ad909b41a76cd37ad3b21451338cbc8e29bfd9ed1739457030a89627986abf33f0214da1fefce54f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fundus-calligra-doc"

RDEPENDS:${PN} += ""

inherit rpm
