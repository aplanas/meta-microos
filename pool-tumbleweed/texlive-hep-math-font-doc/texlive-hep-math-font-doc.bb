SUMMARY = "Documentation for texlive-hep-math-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-math-font"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-doc-2023.209.1.1svn64901-54.1.noarch.rpm"
RPM_HASH = "c6e78a74387a788a6f714c3cd0f5f802c43eb84d6c2742dce3de4cf55ec61fcb6ef85eeab79a72933ae65b0c41f8c1fa587856024b578445ab265e3e42d276b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
