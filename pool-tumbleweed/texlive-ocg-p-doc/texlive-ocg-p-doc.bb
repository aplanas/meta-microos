SUMMARY = "Documentation for texlive-ocg-p"
DESCRIPTION = "This package includes the documentation for texlive-ocg-p"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn28803"

RPM_NAME = "texlive-ocg-p-doc-2023.209.0.0.4svn28803-55.1.noarch.rpm"
RPM_HASH = "70bba8db0848f134b7aa466d1dea72dce10eac3e4b28fac91bac032b767c2e2dd5b7eea5a62ba4f9d4b07b9b2a7cc9000aad4f6a11f02e75ee7310427e787cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocg-p-doc"

RDEPENDS:${PN} += ""

inherit rpm
