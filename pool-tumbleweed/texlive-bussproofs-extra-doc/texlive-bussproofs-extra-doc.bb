SUMMARY = "Documentation for texlive-bussproofs-extra"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs-extra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn51299"

RPM_NAME = "texlive-bussproofs-extra-doc-2023.201.0.0.4svn51299-52.1.noarch.rpm"
RPM_HASH = "89d18b0020d4d7a9b39963c9ef50c8c6af28ff8a280dd9bfb944ff7a97776c074cb7348b7bda5c2bbb6b4ec4a1a55c6e82052f9bff49b776b809e6f38ef12493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
