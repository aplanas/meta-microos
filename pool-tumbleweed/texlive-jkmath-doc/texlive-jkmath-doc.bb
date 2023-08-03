SUMMARY = "Documentation for texlive-jkmath"
DESCRIPTION = "This package includes the documentation for texlive-jkmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn47109"

RPM_NAME = "texlive-jkmath-doc-2023.209.0.0.1svn47109-56.1.noarch.rpm"
RPM_HASH = "e3551f9252c884ddefcbcadb9ec587f72d7d1f91679a5cc2c983c4a181e31a6f654600abd4b2f9f6e95f920c7f8364321ed3dcc08ba06017aea8e3c0f9cbdf04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jkmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
