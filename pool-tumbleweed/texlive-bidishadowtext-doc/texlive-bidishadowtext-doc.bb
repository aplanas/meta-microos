SUMMARY = "Documentation for texlive-bidishadowtext"
DESCRIPTION = "This package includes the documentation for texlive-bidishadowtext"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34633"

RPM_NAME = "texlive-bidishadowtext-doc-2023.201.0.0.1svn34633-53.1.noarch.rpm"
RPM_HASH = "d11c83af5a55e887f46d36f8a6f38b324d51d962a5c10c03775115e0033daf00c3bd01357fa6d4a9ca54edbdd7c034265194dc75a76ac3d6289e936e95dba00b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidishadowtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
