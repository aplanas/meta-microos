SUMMARY = "Documentation for texlive-gettitlestring"
DESCRIPTION = "This package includes the documentation for texlive-gettitlestring"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53170"

RPM_NAME = "texlive-gettitlestring-doc-2023.209.1.6svn53170-53.1.noarch.rpm"
RPM_HASH = "7cdf3acae73c6647efbf1692923452ffa0e13d271a0b2360748781d453f2f4fdfa850ac4001e0356fb6355a03aeb9e7ef6fc63f2e0d0b261bc2e68f576a124e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gettitlestring-doc"

RDEPENDS:${PN} += ""

inherit rpm
