SUMMARY = "Documentation for texlive-ltxdockit"
DESCRIPTION = "This package includes the documentation for texlive-ltxdockit"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2dsvn21869"

RPM_NAME = "texlive-ltxdockit-doc-2023.208.1.2dsvn21869-53.1.noarch.rpm"
RPM_HASH = "df0e1af09584c67d51b4edc06a43c275aba899cbb74acf78ea484806da0f1e83d8742cb0c81504af18faf4730141ffbda04bcbf6ab3cb403889d03821e00b241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxdockit-doc"

RDEPENDS:${PN} += ""

inherit rpm
