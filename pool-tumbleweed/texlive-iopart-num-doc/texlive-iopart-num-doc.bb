SUMMARY = "Documentation for texlive-iopart-num"
DESCRIPTION = "This package includes the documentation for texlive-iopart-num"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-iopart-num-doc-2023.209.2.1svn15878-56.1.noarch.rpm"
RPM_HASH = "e75f3a3d9498838c83a34be8936784638fa7871237a07f78edfb6419508230993a3d5fc768d8007889e317f687d1e9a5992fe769440a6a488c76d1dde7f827f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iopart-num-doc"

RDEPENDS:${PN} += ""

inherit rpm
