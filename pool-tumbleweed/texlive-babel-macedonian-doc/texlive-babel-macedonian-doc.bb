SUMMARY = "Documentation for texlive-babel-macedonian"
DESCRIPTION = "This package includes the documentation for texlive-babel-macedonian"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn39587"

RPM_NAME = "texlive-babel-macedonian-doc-2023.209.svn39587-54.1.noarch.rpm"
RPM_HASH = "19bdd6d3f581e8ac3fed34ac5b7ac281d4d2a4d8a1b206788c3aace3d1b9b4f79b08726d14669deb384ce5cd37d35d398bd21946c035f5d48c6ef5d25a1339fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-macedonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
