SUMMARY = "Documentation for texlive-logpap"
DESCRIPTION = "This package includes the documentation for texlive-logpap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-logpap-doc-2023.209.0.0.6svn15878-55.1.noarch.rpm"
RPM_HASH = "82970af99ecd1000e1b66a8c7c570dbd1c88fd2b2728248a42df472f5c12a03b104d6d0158b692b47764392fe8b18bf4a9da08c81048b554d9fe6fa4a48d738b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logpap-doc"

RDEPENDS:${PN} += ""

inherit rpm
