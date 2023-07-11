SUMMARY = "Documentation for texlive-hvqrurl"
DESCRIPTION = "This package includes the documentation for texlive-hvqrurl"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.02svn59256"

RPM_NAME = "texlive-hvqrurl-doc-2023.208.0.0.02svn59256-53.1.noarch.rpm"
RPM_HASH = "a845c1234c1b7c465301ae7c7490fdb2b040d0d61e20fd7d554eaaf2724c607c30cc3a56fd77f2750794ffccf72756dca5ba85518c8cbcc9023ec6607e70ce3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvqrurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
