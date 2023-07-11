SUMMARY = "Documentation for texlive-invoice"
DESCRIPTION = "This package includes the documentation for texlive-invoice"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn48359"

RPM_NAME = "texlive-invoice-doc-2023.208.svn48359-53.1.noarch.rpm"
RPM_HASH = "41ce3ca2f8bb30a04cd39204a62543fd1eb25859a440926c678242ee6bfeecd4f854950f7e2882a381b3f18b39fb3447b88748013f7515ded22a2a72bb190e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-doc"

RDEPENDS:${PN} += ""

inherit rpm
