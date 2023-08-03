SUMMARY = "Documentation for texlive-pixelart"
DESCRIPTION = "This package includes the documentation for texlive-pixelart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn66012"

RPM_NAME = "texlive-pixelart-doc-2023.209.1.0.2svn66012-52.1.noarch.rpm"
RPM_HASH = "bce507bbc1262bdfcbd1205f53799beb941c5a63333eefb1a78b0485c387142d79d2a78c4f672cade29c9edbc3ffd854fd65556a46d17824394a704c3e39917c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pixelart-doc"

RDEPENDS:${PN} += ""

inherit rpm
