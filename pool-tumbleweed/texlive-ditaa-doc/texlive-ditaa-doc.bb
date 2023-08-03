SUMMARY = "Documentation for texlive-ditaa"
DESCRIPTION = "This package includes the documentation for texlive-ditaa"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn48932"

RPM_NAME = "texlive-ditaa-doc-2023.209.0.0.9svn48932-53.1.noarch.rpm"
RPM_HASH = "c6549c4f7476cee0ab4373298d3513af335eb1600de0c5c96f45a7114e46a247f3595bb274923445907055b5dbd8f7ba3acc6c67d468c5e834dcb9049c1c0b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ditaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
