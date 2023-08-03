SUMMARY = "Documentation for texlive-onedown"
DESCRIPTION = "This package includes the documentation for texlive-onedown"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn59010"

RPM_NAME = "texlive-onedown-doc-2023.209.1.6svn59010-55.1.noarch.rpm"
RPM_HASH = "4ded9acb7acd9b5cbea376296e27b30238c982e55fba8c74e22e5642705271ee30cb45d3e16c597c38fb6d1ddf2b27b96f34bd972576cf010f8c8bbb3b4d4946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onedown-doc"

RDEPENDS:${PN} += ""

inherit rpm
