SUMMARY = "Documentation for texlive-schemabloc"
DESCRIPTION = "This package includes the documentation for texlive-schemabloc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn58212"

RPM_NAME = "texlive-schemabloc-doc-2023.209.1.5svn58212-54.1.noarch.rpm"
RPM_HASH = "d8c5ed7835c309a31269f9cd51fb64fba5ddaf6327a3949b635d22f65b90bfca0d66ba40e1f7df3390b3540213085f9de69b5e8aa1c5d63ed7da13785496b5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schemabloc-doc-fr \
texlive-schemabloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
