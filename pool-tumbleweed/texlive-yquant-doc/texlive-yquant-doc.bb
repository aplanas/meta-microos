SUMMARY = "Documentation for texlive-yquant"
DESCRIPTION = "This package includes the documentation for texlive-yquant"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.3svn65933"

RPM_NAME = "texlive-yquant-doc-2023.201.0.0.7.3svn65933-52.2.noarch.rpm"
RPM_HASH = "ffc66b7263b24cdc6ce24f12372f2e422a7b551211dca2a4bd3038d7bb3f13b2b2f27ea5b7015e9bb9730360d8e09181e1f040bcfe6fd003914b2c679aff0c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yquant-doc"

RDEPENDS:${PN} += ""

inherit rpm
