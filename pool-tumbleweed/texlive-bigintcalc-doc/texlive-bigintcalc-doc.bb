SUMMARY = "Documentation for texlive-bigintcalc"
DESCRIPTION = "This package includes the documentation for texlive-bigintcalc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn53172"

RPM_NAME = "texlive-bigintcalc-doc-2023.209.1.5svn53172-54.1.noarch.rpm"
RPM_HASH = "82d8762725287d26ff1993d5eb2a61e0e37b3fa20ddd1e98a2e6ed5695d27f124a7fd665998136e6a3fb5b28392ebdb2d555eba55f1b128f2a7ca7ddb1662f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigintcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
