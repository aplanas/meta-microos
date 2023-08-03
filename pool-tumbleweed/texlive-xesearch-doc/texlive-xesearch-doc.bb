SUMMARY = "Documentation for texlive-xesearch"
DESCRIPTION = "This package includes the documentation for texlive-xesearch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-doc-2023.209.0.0.2svn51908-53.1.noarch.rpm"
RPM_HASH = "d4e57c60ba339ad3c004680c6d8f9707f130ccc6e0c6330891917420e69be58bba3e679d1b22b6ef40ea4d99f88a0c9afef668be5e6956a6e68aacb58f4455d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xesearch-doc"

RDEPENDS:${PN} += ""

inherit rpm
