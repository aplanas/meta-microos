SUMMARY = "Documentation for texlive-subfig"
DESCRIPTION = "This package includes the documentation for texlive-subfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-subfig-doc-2023.209.1.3svn15878-58.1.noarch.rpm"
RPM_HASH = "fea6082e8c9ddd929cc5651b690f51e2ecdf7110688ef1427cce8b94b8a527e224b197ea7a70e56afd6de9f7f8911f5cdf862c3ca514c3ef45a36a96e751d12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
