SUMMARY = "Documentation for texlive-bchart"
DESCRIPTION = "This package includes the documentation for texlive-bchart"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn43928"

RPM_NAME = "texlive-bchart-doc-2023.201.0.0.1.3svn43928-53.1.noarch.rpm"
RPM_HASH = "3e289f765fca173582f863e3ee1d13e776997850fa1dbc8ee3378f0fd9d3a6acf1ed6b5b5bbda0ef49237e5875acb47c09b5f4db29c291663d23fb2627bcc4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
