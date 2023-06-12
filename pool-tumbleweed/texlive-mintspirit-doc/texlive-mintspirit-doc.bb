SUMMARY = "Documentation for texlive-mintspirit"
DESCRIPTION = "This package includes the documentation for texlive-mintspirit"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64461"

RPM_NAME = "texlive-mintspirit-doc-2023.201.svn64461-54.1.noarch.rpm"
RPM_HASH = "8bb6a47f26c06857e5293b83eb2bb4340b929a591fca7145858a0c9f58435e3d9974bba945255895ab5d5e2354a6f80dfe8c0e5a929b3cc1efeb20355074f9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mintspirit-doc"
RDEPENDS:${PN} += ""

inherit rpm
