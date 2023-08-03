SUMMARY = "Documentation for texlive-bookshelf"
DESCRIPTION = "This package includes the documentation for texlive-bookshelf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn55475"

RPM_NAME = "texlive-bookshelf-doc-2023.209.0.0.5svn55475-53.1.noarch.rpm"
RPM_HASH = "8c308358260eb276d4577ff83d4792db8e527dd0857e345851768c0db1abebc98793c5fed5847198c39a750795eb863c92c9f69f435ac6ab7d7f27a521b4cc95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookshelf-doc"

RDEPENDS:${PN} += ""

inherit rpm
