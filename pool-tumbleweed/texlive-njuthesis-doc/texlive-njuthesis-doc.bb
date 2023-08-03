SUMMARY = "Documentation for texlive-njuthesis"
DESCRIPTION = "This package includes the documentation for texlive-njuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn65546"

RPM_NAME = "texlive-njuthesis-doc-2023.209.1.1.2svn65546-55.1.noarch.rpm"
RPM_HASH = "21e5b32b94998beef0950378a80ebe4e2507ebfad0d5192e34f76a6336d19317bc45df6cfcaf707a42e820ceca7364a216039124477a42da0ca2faf9e19ff139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-njuthesis-doc-zh \
texlive-njuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
