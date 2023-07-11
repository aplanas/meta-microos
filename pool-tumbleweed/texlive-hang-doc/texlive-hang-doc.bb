SUMMARY = "Documentation for texlive-hang"
DESCRIPTION = "This package includes the documentation for texlive-hang"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn43280"

RPM_NAME = "texlive-hang-doc-2023.201.2.1svn43280-53.2.noarch.rpm"
RPM_HASH = "dc1b9b2a46cdc47f919eb15209fd5f6301a0656e7a0acb56b810dd05ea4991e46a460f1b86f87a9abb7be023f38c504a8bfc7cfcbf81db73bde7f2141195de8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hang-doc"

RDEPENDS:${PN} += ""

inherit rpm
