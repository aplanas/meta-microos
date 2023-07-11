SUMMARY = "Documentation for texlive-egameps"
DESCRIPTION = "This package includes the documentation for texlive-egameps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-egameps-doc-2023.201.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "a230776c4004b5140ea6ef7fc10536b5ada577c53da743c00c3d05f5c95a6bcfc3e9a78eefc61c54ef03f54666e60ddd8208b83f8332764402337f69991e590e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egameps-doc"

RDEPENDS:${PN} += ""

inherit rpm
