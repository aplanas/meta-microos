SUMMARY = "Documentation for texlive-xargs"
DESCRIPTION = "This package includes the documentation for texlive-xargs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xargs-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "ca791c0a2115ccc443a52dfb7338cdd6ca55b60ae209d593d953441d60d3e5d033948e4507975f3c02f81a2b9733c24abf5a109fc066b35e85fc38f74733e6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xargs-doc:fr;en) \
texlive-xargs-doc"
RDEPENDS:${PN} += ""

inherit rpm
