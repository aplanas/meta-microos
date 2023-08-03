SUMMARY = "Documentation for texlive-l3kernel"
DESCRIPTION = "This package includes the documentation for texlive-l3kernel"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66094"

RPM_NAME = "texlive-l3kernel-doc-2023.209.svn66094-56.1.noarch.rpm"
RPM_HASH = "0c13a44d1715e89eb7709c216ca8d88fea5e02c9081dca414f7efbc975213ef53f02e40095dad9aa317f276a78ce14bba59471d5682ef17bb1e0c230793e9e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3kernel-doc"

RDEPENDS:${PN} += ""

inherit rpm
