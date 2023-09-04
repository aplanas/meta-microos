SUMMARY = "Documentation for texlive-ytableau"
DESCRIPTION = "This package includes the documentation for texlive-ytableau"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn59580"

RPM_NAME = "texlive-ytableau-doc-2023.209.1.4svn59580-53.2.noarch.rpm"
RPM_HASH = "ad4e3d838e839d449ada104cbe68972e83841973189cfbeacbd2472b89d49103a80d18c65d65b77c3d0d541a353c9ec8f85a79ed2a6d574fcd7b87d5e8493cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ytableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
