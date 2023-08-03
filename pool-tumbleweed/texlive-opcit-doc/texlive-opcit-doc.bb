SUMMARY = "Documentation for texlive-opcit"
DESCRIPTION = "This package includes the documentation for texlive-opcit"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-opcit-doc-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "e822ed2da98bf7b509e04f8ad0246d3bd40058bb070b230edd9fde747add6c40662fe71678fb3fa6bcfd8c484777eb09254d184ee6491bbab3d0ee835823ab28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opcit-doc"

RDEPENDS:${PN} += ""

inherit rpm
