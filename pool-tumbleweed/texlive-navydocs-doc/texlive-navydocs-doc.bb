SUMMARY = "Documentation for texlive-navydocs"
DESCRIPTION = "This package includes the documentation for texlive-navydocs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn41643"

RPM_NAME = "texlive-navydocs-doc-2023.201.1.1svn41643-54.1.noarch.rpm"
RPM_HASH = "722da36d777dbbf0723b0979ab0245c8b70ca039178d8c086295c8c7fd223e2a97ec5b1dfc6c46f33f668297b841a316b53eb4179444010ac8e172b36c440957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-navydocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
