SUMMARY = "Documentation for texlive-robustcommand"
DESCRIPTION = "This package includes the documentation for texlive-robustcommand"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-doc-2023.209.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "0e2ad541401708d4b7e69db3395ef535d943d065065e70ea06e93c34f14ef8f749bfc0c5a2f140524f4cc9b42c1c77bf0279ada9a0e1ab7e3a283e9b1e8fe5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-robustcommand-doc-de \
texlive-robustcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
