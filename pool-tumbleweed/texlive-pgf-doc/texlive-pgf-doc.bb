SUMMARY = "Documentation for texlive-pgf"
DESCRIPTION = "This package includes the documentation for texlive-pgf"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.10svn65553"

RPM_NAME = "texlive-pgf-doc-2023.209.3.1.10svn65553-52.1.noarch.rpm"
RPM_HASH = "a5d366f3c0399871dd733e37e987b20207ab3abd3e6b50ab7b1f3fa3ebaf3826061450a37aff2398c490048f548aaa6686b11bef9315137e44e83136612437af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-doc"

RDEPENDS:${PN} += ""

inherit rpm
