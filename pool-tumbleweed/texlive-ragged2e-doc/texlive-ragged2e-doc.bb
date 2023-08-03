SUMMARY = "Documentation for texlive-ragged2e"
DESCRIPTION = "This package includes the documentation for texlive-ragged2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn66152"

RPM_NAME = "texlive-ragged2e-doc-2023.209.3.4svn66152-54.1.noarch.rpm"
RPM_HASH = "8643cc6fec53a287d6317db4ea48a84c79dcef003b83cd437171696da8ab949e48a2d8b69d7f8e65ca60714fde5ddb33b5f443b6f5cae94c8a323cabdb485367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ragged2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
