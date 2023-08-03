SUMMARY = "Documentation for texlive-topletter"
DESCRIPTION = "This package includes the documentation for texlive-topletter"
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.3.0svn48182"

RPM_NAME = "texlive-topletter-doc-2023.209.0.0.3.0svn48182-53.1.noarch.rpm"
RPM_HASH = "c2e2a12b6ae39179c3133ac2f29a13491dd5cdefd847dc7cf51de7775136b2c4c93e3d3be4cd173a44d492aa601c86a2e02e230120d15e38e15b7ba5e1e2b5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-topletter-doc-it \
texlive-topletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
