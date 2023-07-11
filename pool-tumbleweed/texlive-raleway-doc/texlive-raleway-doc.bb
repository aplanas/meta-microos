SUMMARY = "Documentation for texlive-raleway"
DESCRIPTION = "This package includes the documentation for texlive-raleway"
LICENSE = "OFL-1.1"

PV = "2023.201.1.4svn42629"

RPM_NAME = "texlive-raleway-doc-2023.201.1.4svn42629-53.2.noarch.rpm"
RPM_HASH = "2b2c210ebd69136e9bcdefe27e333ed53af2daa5b2f5fc7b58870d30d1898a1c765709236ba6694f765ff0a616f161ccac840e5132171ae3b88817288e196bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-raleway-doc"

RDEPENDS:${PN} += ""

inherit rpm
