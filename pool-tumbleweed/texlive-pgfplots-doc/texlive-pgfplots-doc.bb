SUMMARY = "Documentation for texlive-pgfplots"
DESCRIPTION = "This package includes the documentation for texlive-pgfplots"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.18.1svn61719"

RPM_NAME = "texlive-pgfplots-doc-2023.209.1.18.1svn61719-52.1.noarch.rpm"
RPM_HASH = "41ede941fc2e70fd53cc789a71e04c5d7982f302034f4ac3d9da857666c200616f5eaa10e83221009e355ea72f57130c0829b182cd5dab41a0860e4969f1bdff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
