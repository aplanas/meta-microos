SUMMARY = "Documentation for texlive-nag"
DESCRIPTION = "This package includes the documentation for texlive-nag"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn24741"

RPM_NAME = "texlive-nag-doc-2023.209.0.0.7svn24741-55.1.noarch.rpm"
RPM_HASH = "87b93d7a77c401d33d5c04e7bfc082d83b65e7b3425ceec35813d2a4c1f0820710721782cd6594a3e02b25b6d79a52c2e46b547f5a4b1d7ed807af37e82d3a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nag-doc"

RDEPENDS:${PN} += ""

inherit rpm
