SUMMARY = "Documentation for texlive-expdlist"
DESCRIPTION = "This package includes the documentation for texlive-expdlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn15878"

RPM_NAME = "texlive-expdlist-doc-2023.209.2.4svn15878-53.1.noarch.rpm"
RPM_HASH = "9040c40ba9461a94d12caf501ccf9042508b285c6e1588e8a220fb2deb0a5356d7239aacd847d7fcdaf8d57254b0bc4b98b72aa778549981a022a32dfcf38fd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-expdlist-doc-de;en \
texlive-expdlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
