SUMMARY = "Documentation for texlive-hideanswer"
DESCRIPTION = "This package includes the documentation for texlive-hideanswer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63852"

RPM_NAME = "texlive-hideanswer-doc-2023.201.1.1svn63852-53.1.noarch.rpm"
RPM_HASH = "6931b167dda9484f345e2cb2feafb82ba75f92b95b5c168232b3b3296ee5f27f8974c3e29381901a38d3f00abb84fbbe3e5faa22318f328ff014c6ae93531053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hideanswer-doc"

RDEPENDS:${PN} += ""

inherit rpm
