SUMMARY = "Documentation for texlive-mnotes"
DESCRIPTION = "This package includes the documentation for texlive-mnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn63406"

RPM_NAME = "texlive-mnotes-doc-2023.201.0.0.9svn63406-54.1.noarch.rpm"
RPM_HASH = "3567f9b36c139fa3ad134520636531458e2075dbe179e1c2b06cd51fc7d3b70ee92a94f8662c2919fc7a6bf79024ef3d225faf09d9fa13ec38cee3bc20ff2f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
