SUMMARY = "Documentation for texlive-biblatex-sbl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-sbl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.14svn63639"

RPM_NAME = "texlive-biblatex-sbl-doc-2023.201.0.0.14svn63639-53.1.noarch.rpm"
RPM_HASH = "8c9fe00f83ddc9db3c58619b6732d9f7e9b93dbb7175ba8a8b812f952dad605c1d5ce0ab3d8f630530ecd1bd22ca8f6f549cfd47c97bbce44b17e6b7fc048553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-sbl-doc"
RDEPENDS:${PN} += ""

inherit rpm
