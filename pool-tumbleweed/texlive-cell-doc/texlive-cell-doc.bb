SUMMARY = "Documentation for texlive-cell"
DESCRIPTION = "This package includes the documentation for texlive-cell"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42428"

RPM_NAME = "texlive-cell-doc-2023.201.svn42428-52.1.noarch.rpm"
RPM_HASH = "c523deae1f21552bd1d27cb7721d413d8e18b41583f9a866821bae5cb1bfdbb3fdf364edcd2d536c0dd912b2e15f1cfd0cfa0074d3a48190c9ca60c9f3d865cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cell-doc"
RDEPENDS:${PN} += ""

inherit rpm
