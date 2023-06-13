SUMMARY = "Documentation for texlive-pst-abspos"
DESCRIPTION = "This package includes the documentation for texlive-pst-abspos"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-pst-abspos-doc-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "bd59273345ea400d7816601b1dca460cd1415b821660b8d1555bb6c2a88df01f88c63b48a40812685bfde520d9d65d9b188f6bf4fb68f2dfd8cdc29e77cc7cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-abspos-doc"

RDEPENDS:${PN} += ""

inherit rpm
