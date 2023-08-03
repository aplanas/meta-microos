SUMMARY = "Documentation for texlive-splitbib"
DESCRIPTION = "This package includes the documentation for texlive-splitbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.17svn15878"

RPM_NAME = "texlive-splitbib-doc-2023.209.1.17svn15878-58.1.noarch.rpm"
RPM_HASH = "e395596941084682836ce2425f80738d34c0e2014409f6d9126a53fbdcefe09b8e10a9e442db27285279a6f9403f84833a5ea01001fee08d8f8fb3cd3a3f3481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splitbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
