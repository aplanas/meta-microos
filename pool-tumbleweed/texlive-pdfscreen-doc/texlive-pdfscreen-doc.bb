SUMMARY = "Documentation for texlive-pdfscreen"
DESCRIPTION = "This package includes the documentation for texlive-pdfscreen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn42428"

RPM_NAME = "texlive-pdfscreen-doc-2023.209.1.5svn42428-52.1.noarch.rpm"
RPM_HASH = "9a2ed4a60b719956c7a882485903203e335f62151861c673a1bd1013e2ff8c490150457784da741881f6444e236169f3e73517084ee70ce0091e0c3357ae30ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfscreen-doc"

RDEPENDS:${PN} += ""

inherit rpm
