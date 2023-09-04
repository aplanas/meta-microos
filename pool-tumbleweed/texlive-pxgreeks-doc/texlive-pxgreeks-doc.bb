SUMMARY = "Documentation for texlive-pxgreeks"
DESCRIPTION = "This package includes the documentation for texlive-pxgreeks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-doc-2023.209.1.0svn21838-54.2.noarch.rpm"
RPM_HASH = "e6739c0dc44630d8d755c3f9926f2b70d453235655744b58243ae20d898a982b74274a4e47886b89fef0eb905324e94377e8bd8c6c0b67e1787ac8e2b8779f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
