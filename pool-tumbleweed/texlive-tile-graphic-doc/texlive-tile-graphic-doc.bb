SUMMARY = "Documentation for texlive-tile-graphic"
DESCRIPTION = "This package includes the documentation for texlive-tile-graphic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55325"

RPM_NAME = "texlive-tile-graphic-doc-2023.209.svn55325-53.1.noarch.rpm"
RPM_HASH = "98ad84dccc007411eb52a37824d540f7e7a1bb08a430008f27a375f6f04ac34ccee68c7e8e29be63826fd71affe27b1acdb6a67f40febdb9c51e4412b2898a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tile-graphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
