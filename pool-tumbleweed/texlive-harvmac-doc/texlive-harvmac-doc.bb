SUMMARY = "Documentation for texlive-harvmac"
DESCRIPTION = "This package includes the documentation for texlive-harvmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harvmac-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "633a98ee3e8052274b4dc3c32d58a67379a7cab6310b41ef8d44edb551b0864fbf3c4bfc14a2f6f1525dd7a2a788006c5cd50f55d4b32e3f7aab07a68a82f93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
