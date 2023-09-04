SUMMARY = "Documentation for texlive-hvqrurl"
DESCRIPTION = "This package includes the documentation for texlive-hvqrurl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn59256"

RPM_NAME = "texlive-hvqrurl-doc-2023.209.0.0.02svn59256-54.1.noarch.rpm"
RPM_HASH = "bf977da5322b3ff014a573f0167bf0229599b01ec292d872980ff83186685e3394b0c92cbc82c657e9bd5505eb72dbfd236957a79c91deb181346e1045e9e0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvqrurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
