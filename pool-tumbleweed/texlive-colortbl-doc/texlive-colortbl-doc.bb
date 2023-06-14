SUMMARY = "Documentation for texlive-colortbl"
DESCRIPTION = "This package includes the documentation for texlive-colortbl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn64015"

RPM_NAME = "texlive-colortbl-doc-2023.201.1.0fsvn64015-53.1.noarch.rpm"
RPM_HASH = "d63ffc90b209117d38152684ac4e92815e91ef1a4f9f5827f619cdf78a8532ccb78f0122d72cabe529cf1cf18297d3c44ee5bfa8955f49ac3cafee99680cb00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-colortbl-doc-de;en \
texlive-colortbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
