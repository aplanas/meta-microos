SUMMARY = "Documentation for texlive-biblatex-musuos"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-musuos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24097"

RPM_NAME = "texlive-biblatex-musuos-doc-2023.201.1.0svn24097-53.1.noarch.rpm"
RPM_HASH = "7081c2fccb3d9ba8f1ba66cc779931a54240ee4733c16c76d7de9e93f8336ade30d233f8bcbbfe68eb8de7701750d3e71040c62fd7c21bc484c30989a4bf6e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-musuos-doc"
RDEPENDS:${PN} += ""

inherit rpm
