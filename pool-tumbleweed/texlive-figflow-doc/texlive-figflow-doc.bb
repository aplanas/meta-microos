SUMMARY = "Documentation for texlive-figflow"
DESCRIPTION = "This package includes the documentation for texlive-figflow"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21462"

RPM_NAME = "texlive-figflow-doc-2023.209.svn21462-53.1.noarch.rpm"
RPM_HASH = "1497d2c4618cf15e5c77cd84b4252228206ff0e0e7954e4f4afcda96bf10ca76f14546cabbcdd1a25594ccab8967f84fbe77a57113f91f2d226421fb72137e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
