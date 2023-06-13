SUMMARY = "Documentation for texlive-ionumbers"
DESCRIPTION = "This package includes the documentation for texlive-ionumbers"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3.3svn33457"

RPM_NAME = "texlive-ionumbers-doc-2023.201.0.0.3.3svn33457-55.1.noarch.rpm"
RPM_HASH = "2bc9ae29d63997957dc4f415e99c29689759e8dee8d52a6cd18fe06b13808de67c2c3018284135335fcea4e0e97d7751d864cdbc40fe7d58aec97a921ebcd47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ionumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
