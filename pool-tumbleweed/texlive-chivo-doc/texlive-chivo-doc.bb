SUMMARY = "Documentation for texlive-chivo"
DESCRIPTION = "This package includes the documentation for texlive-chivo"
LICENSE = "OFL-1.1"

PV = "2023.209.2.2svn65029"

RPM_NAME = "texlive-chivo-doc-2023.209.2.2svn65029-54.1.noarch.rpm"
RPM_HASH = "e5b795576b01524cf074c5de436ade1b43479b3f44be15624d968c5f9b9a1e9e31cc312062411497888f83c61f2673efb3448e0e7886dec505b84a1ead7bd0b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chivo-doc"

RDEPENDS:${PN} += ""

inherit rpm
