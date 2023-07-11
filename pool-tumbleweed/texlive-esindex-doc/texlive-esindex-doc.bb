SUMMARY = "Documentation for texlive-esindex"
DESCRIPTION = "This package includes the documentation for texlive-esindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn52342"

RPM_NAME = "texlive-esindex-doc-2023.201.1.7svn52342-53.2.noarch.rpm"
RPM_HASH = "fa13ce8028be83c787be2b95c0de91de0d131e95183df18b6e99cc8eb2c18878b7f4a22a9f3fc685d38cab607006691cd6fb620fa6f14192d8f99c8c59d72b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
