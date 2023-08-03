SUMMARY = "Documentation for texlive-biblatex-jura2"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-jura2"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64762"

RPM_NAME = "texlive-biblatex-jura2-doc-2023.209.0.0.5svn64762-54.1.noarch.rpm"
RPM_HASH = "62ff02fab6212867e98a12cd5927d7a4a0ac5bb18afc36b81dfcf8ab29102dd2ad3daf005c7d95d7ac5700c90792caac4aa8137c018c800e47a5354f1821d61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-jura2-doc-de \
texlive-biblatex-jura2-doc"

RDEPENDS:${PN} += ""

inherit rpm
