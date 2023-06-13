SUMMARY = "Documentation for texlive-cuisine"
DESCRIPTION = "This package includes the documentation for texlive-cuisine"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.7svn34453"

RPM_NAME = "texlive-cuisine-doc-2023.204.0.0.7svn34453-54.1.noarch.rpm"
RPM_HASH = "58dc2c3841fd15ad3fcfe3dfd6c81f0e029f30370e60ec06060271c115fbe2ab5101dbf1dd4af067294b8212dfaf9c3d27a434ada01118623e9857188daea0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cuisine-doc"

RDEPENDS:${PN} += ""

inherit rpm
