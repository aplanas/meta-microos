SUMMARY = "Documentation for texlive-pst-text"
DESCRIPTION = "This package includes the documentation for texlive-pst-text"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn49542"

RPM_NAME = "texlive-pst-text-doc-2023.209.1.02svn49542-54.1.noarch.rpm"
RPM_HASH = "701c59876895f2df9ab2a55f33f334542fac71835794fb826acb667d7b4ec39de9af779d71bfc6a35f3035db405fb3e8b1ad4846fd02bf400fa80271289398f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
