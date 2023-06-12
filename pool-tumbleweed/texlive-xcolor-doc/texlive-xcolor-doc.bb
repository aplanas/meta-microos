SUMMARY = "Documentation for texlive-xcolor"
DESCRIPTION = "This package includes the documentation for texlive-xcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn63563"

RPM_NAME = "texlive-xcolor-doc-2023.201.2.14svn63563-52.1.noarch.rpm"
RPM_HASH = "76f61221766b73204e97c5fd84bcc2fb03e60783a6c8e1430f51bb659a7efab5ab26460a64f49d5beb3a5d340bcc2fd2227a98e75c044ce270c296ed52ccfcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-doc"
RDEPENDS:${PN} += ""

inherit rpm
