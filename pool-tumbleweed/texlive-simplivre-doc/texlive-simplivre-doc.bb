SUMMARY = "Documentation for texlive-simplivre"
DESCRIPTION = "This package includes the documentation for texlive-simplivre"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-simplivre-doc-2023.201.svn65475-57.1.noarch.rpm"
RPM_HASH = "25d8762425de9591742a1b922382353743d0f31fd6bd56a62585e8d1d9fe9d626762258f2262b294fcb8743135509cf4d25004481403133dcc8c521fbbae6950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplivre-doc"

RDEPENDS:${PN} += ""

inherit rpm
