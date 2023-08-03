SUMMARY = "Documentation for texlive-auxhook"
DESCRIPTION = "This package includes the documentation for texlive-auxhook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53173"

RPM_NAME = "texlive-auxhook-doc-2023.209.1.6svn53173-54.1.noarch.rpm"
RPM_HASH = "5b2b6eda623a1ada648654a14d6679236040ce5c4d14fc99ae8e2a9b200c196dcf939f9bfc5cc7934d7cb98af56dda8e70a9f1321d501fb976d6ebe5ad5bc48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auxhook-doc"

RDEPENDS:${PN} += ""

inherit rpm
