SUMMARY = "Documentation for texlive-hitszthesis"
DESCRIPTION = "This package includes the documentation for texlive-hitszthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-doc-2023.209.3.2.1svn61073-54.1.noarch.rpm"
RPM_HASH = "22b423cec7f4c6ba2c45651242ea2b0c2a173b7549a2b8ec330f80a34744f4429088615b93bc80331753fe56e6941f9a021a54aa00de231990cf4645c28f4ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszthesis-doc-zh \
texlive-hitszthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
