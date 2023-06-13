SUMMARY = "Documentation for texlive-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-ijsra"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44886"

RPM_NAME = "texlive-ijsra-doc-2023.201.1.1svn44886-52.1.noarch.rpm"
RPM_HASH = "48239fa5884a07ea1e370fa776c6f62ba0abc8c4e61fb0b8d0a3e1b727b67555d47507f836ec7501856d98c76cd17274cd12d48dfab98b94bba6750f3223d257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijsra-doc"

RDEPENDS:${PN} += ""

inherit rpm
