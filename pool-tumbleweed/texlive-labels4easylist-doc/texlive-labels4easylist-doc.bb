SUMMARY = "Documentation for texlive-labels4easylist"
DESCRIPTION = "This package includes the documentation for texlive-labels4easylist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51124"

RPM_NAME = "texlive-labels4easylist-doc-2023.209.1.0svn51124-56.1.noarch.rpm"
RPM_HASH = "e5d6363d1a4658eabe8e675f7ed8a8c813417b81d7a7ed41e6eb912252b0cc0de88fded0911ceefbe059efb90b1372d7f4cb8db5eaaf3a9ed7a60b8270d57300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labels4easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
