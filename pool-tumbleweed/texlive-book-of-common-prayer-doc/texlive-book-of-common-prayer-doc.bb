SUMMARY = "Documentation for texlive-book-of-common-prayer"
DESCRIPTION = "This package includes the documentation for texlive-book-of-common-prayer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn62240"

RPM_NAME = "texlive-book-of-common-prayer-doc-2023.209.1.1.0svn62240-53.1.noarch.rpm"
RPM_HASH = "1d2e9634366080b5cb57aa9c9b05bd35564bfa54edebb8479c4a08f44e1982dfa4c1ab0a88a9990ab6c7f422c03ea8946a8f2aff011ef7981e1853954a0461a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-book-of-common-prayer-doc"

RDEPENDS:${PN} += ""

inherit rpm
