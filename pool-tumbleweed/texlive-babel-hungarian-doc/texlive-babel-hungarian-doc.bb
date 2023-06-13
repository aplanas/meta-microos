SUMMARY = "Documentation for texlive-babel-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-babel-hungarian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5csvn49701"

RPM_NAME = "texlive-babel-hungarian-doc-2023.201.1.5csvn49701-53.1.noarch.rpm"
RPM_HASH = "eada524e01092906ec44f562ee3943a9d1e2d86fe4d769e63a9cf6f5e8dcd0bea3d89838b39b5f3f8e819f319952fdd8d506881b62465c4989ca8b0b03d8c432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-hungarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
