SUMMARY = "Documentation for texlive-russ"
DESCRIPTION = "This package includes the documentation for texlive-russ"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25209"

RPM_NAME = "texlive-russ-doc-2023.209.svn25209-54.1.noarch.rpm"
RPM_HASH = "43c22025b204cb4b5403983f50c1deb776369bfe79f6a9760073f730391502419c8c413a389d2808a3b6eb11335f5caa4d2dcb1c59ba4c7aac038274712d0b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-russ-doc-en;ru \
texlive-russ-doc"

RDEPENDS:${PN} += ""

inherit rpm
