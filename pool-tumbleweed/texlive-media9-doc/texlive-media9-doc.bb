SUMMARY = "Documentation for texlive-media9"
DESCRIPTION = "This package includes the documentation for texlive-media9"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn64047"

RPM_NAME = "texlive-media9-doc-2023.201.1.25svn64047-52.1.noarch.rpm"
RPM_HASH = "df7f61dc5d992ff3e46f8829d86fa4ffa21614003f40f8bae49194919b4ceecf0d4a612b89a38729ceaaaf427b78f6cb3d2be5f67ad0987843e79298c9143c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-media9-doc"
RDEPENDS:${PN} += ""

inherit rpm
