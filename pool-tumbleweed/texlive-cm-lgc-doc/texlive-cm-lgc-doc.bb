SUMMARY = "Documentation for texlive-cm-lgc"
DESCRIPTION = "This package includes the documentation for texlive-cm-lgc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5svn28250"

RPM_NAME = "texlive-cm-lgc-doc-2023.209.0.0.5svn28250-54.1.noarch.rpm"
RPM_HASH = "8d70a892c6ce25c552f3ef8b66185f28eb1c902ac1854bf6adac61df2ee0c78638fae3f6f14065316a9b79af7d76356dbc4962fdaf970972b12b002fbfc5c94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-lgc-doc"

RDEPENDS:${PN} += ""

inherit rpm
