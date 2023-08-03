SUMMARY = "Documentation for texlive-termlist"
DESCRIPTION = "This package includes the documentation for texlive-termlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn18923"

RPM_NAME = "texlive-termlist-doc-2023.209.1.1svn18923-55.1.noarch.rpm"
RPM_HASH = "e63246c3dd6457e0a82cf803e2e58fefede9513cae76b2518ca977fe54f70434f31ed53b7d7cc480aec0df2dd954ac66d662d284c5a2c6b6030766efa0315a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
