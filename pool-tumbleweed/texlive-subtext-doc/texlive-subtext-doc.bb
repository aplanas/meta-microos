SUMMARY = "Documentation for texlive-subtext"
DESCRIPTION = "This package includes the documentation for texlive-subtext"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn51273"

RPM_NAME = "texlive-subtext-doc-2023.209.1.1svn51273-58.1.noarch.rpm"
RPM_HASH = "4241a6fbd92e5e66064ad3e4ca21de99897977f8bc6fc84d703865667dec78daa9dea03b9ba2702badcc24252ad8c14f55422ea1ced048fbd619e5ced3073baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
