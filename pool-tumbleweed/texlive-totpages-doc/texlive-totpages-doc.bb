SUMMARY = "Documentation for texlive-totpages"
DESCRIPTION = "This package includes the documentation for texlive-totpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn15878"

RPM_NAME = "texlive-totpages-doc-2023.201.2.00svn15878-52.1.noarch.rpm"
RPM_HASH = "d7376764f2ca03ec1ed32c01e2fb0ba1b1d03b8ff0b020facad22956d3255976f97237fccdaed885b22c078f3f2af260a680536e5486a9acda0084b49d7f53bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
