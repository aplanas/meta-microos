SUMMARY = "Documentation for texlive-bredzenie"
DESCRIPTION = "This package includes the documentation for texlive-bredzenie"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44371"

RPM_NAME = "texlive-bredzenie-doc-2023.209.1.0svn44371-53.1.noarch.rpm"
RPM_HASH = "92168edfeaf6f81b9c489913fbc96903814f202b9c9a55fec6ea215a0e57c394841161b884877ec1664ae80b87c6b765f1be7cb92895c52b993e5f4ac5d627d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bredzenie-doc"

RDEPENDS:${PN} += ""

inherit rpm
