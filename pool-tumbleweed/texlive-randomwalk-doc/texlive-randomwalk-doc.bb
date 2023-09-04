SUMMARY = "Documentation for texlive-randomwalk"
DESCRIPTION = "This package includes the documentation for texlive-randomwalk"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-doc-2023.209.0.0.6svn49513-54.2.noarch.rpm"
RPM_HASH = "56a56d9fd419d77fe2dc6f3e11c64993c6c61078b96a18ebfb7c39960fe0dad0e58a90b88acae903e4d6a4d5ddfe3d274384c350ad1f355cb9bb02d946494418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomwalk-doc"

RDEPENDS:${PN} += ""

inherit rpm
