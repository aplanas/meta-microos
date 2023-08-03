SUMMARY = "Documentation for texlive-ptptex"
DESCRIPTION = "This package includes the documentation for texlive-ptptex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-doc-2023.209.0.0.91svn19440-54.1.noarch.rpm"
RPM_HASH = "a7b9ebfd2d53abbc621ae78a90126f67cc801746ffaad770aa6ffd8b049e7d4c594f85c8938206c68f629eb40f507ad31c25db646bcc5e105027a02b67528694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
