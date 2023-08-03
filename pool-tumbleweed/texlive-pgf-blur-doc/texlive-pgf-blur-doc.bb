SUMMARY = "Documentation for texlive-pgf-blur"
DESCRIPTION = "This package includes the documentation for texlive-pgf-blur"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn54512"

RPM_NAME = "texlive-pgf-blur-doc-2023.209.1.02svn54512-52.1.noarch.rpm"
RPM_HASH = "8dcc4324ca086ae4a5c5633a1a0f4c35624993e28f4e8a12a71cb0ddda05c6c5ff3a6d2e510daef05d4764572f5203fa61019e2fd30d74026da266e0459e84d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-blur-doc"

RDEPENDS:${PN} += ""

inherit rpm
