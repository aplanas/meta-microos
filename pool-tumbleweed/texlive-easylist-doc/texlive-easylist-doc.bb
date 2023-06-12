SUMMARY = "Documentation for texlive-easylist"
DESCRIPTION = "This package includes the documentation for texlive-easylist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn32661"

RPM_NAME = "texlive-easylist-doc-2023.201.1.3svn32661-53.1.noarch.rpm"
RPM_HASH = "736176c849e4daebbcc08d95a6aeedc2ab4c3ea2a06925bc708a401a3751588dc0fc1c0879db43effe14132e04549add04a90e944e2cf886ac44964a6247032c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easylist-doc"
RDEPENDS:${PN} += ""

inherit rpm
