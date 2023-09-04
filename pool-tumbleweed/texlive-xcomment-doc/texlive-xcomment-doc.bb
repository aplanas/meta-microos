SUMMARY = "Documentation for texlive-xcomment"
DESCRIPTION = "This package includes the documentation for texlive-xcomment"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn20031"

RPM_NAME = "texlive-xcomment-doc-2023.209.1.3svn20031-53.2.noarch.rpm"
RPM_HASH = "2c02c1e3bddb48ebe4dc699b7f163aa83623806cea775e600d1381ff4933f81d45bbe4556d1b2d195d415f61f67a359074773175fbc2fc3dc09775dd906479c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
