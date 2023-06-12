SUMMARY = "Documentation for texlive-dox"
DESCRIPTION = "This package includes the documentation for texlive-dox"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn46011"

RPM_NAME = "texlive-dox-doc-2023.201.2.4svn46011-52.1.noarch.rpm"
RPM_HASH = "db21595c91c00de10dd8c5dbc8a3ba7b20280069e82f6421cf90c573abddb5b4e508e3aada4f345a8fb9eef84e8bea88067f8ac85f2977024f99639fd019a5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dox-doc"
RDEPENDS:${PN} += ""

inherit rpm
