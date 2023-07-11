SUMMARY = "Documentation for texlive-qrbill"
DESCRIPTION = "This package includes the documentation for texlive-qrbill"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn66301"

RPM_NAME = "texlive-qrbill-doc-2023.201.2.00svn66301-53.2.noarch.rpm"
RPM_HASH = "bf2fa818291e796dafabb875e5e0412a303e194dfd66f1779a29c711b0086d95ca0cccda9ecf86fc330ded8e4cf9f5d7144d4dabeb88b8731c50d1c1829f318c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
