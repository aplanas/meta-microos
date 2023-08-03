SUMMARY = "Documentation for texlive-phfqit"
DESCRIPTION = "This package includes the documentation for texlive-phfqit"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1svn60734"

RPM_NAME = "texlive-phfqit-doc-2023.209.4.1svn60734-52.1.noarch.rpm"
RPM_HASH = "7454bf2341c0d2a1dbf272d9d0b793d9d47a727086d349199b29e5c43465b06960b96323abf876037990c4d933e553dd270d7390f4f8f87a6276d449872baaa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfqit-doc"

RDEPENDS:${PN} += ""

inherit rpm
