SUMMARY = "Documentation for texlive-impnattypo"
DESCRIPTION = "This package includes the documentation for texlive-impnattypo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn50227"

RPM_NAME = "texlive-impnattypo-doc-2023.209.1.5svn50227-54.1.noarch.rpm"
RPM_HASH = "8f56f346a4a176a54b0d058082f550e434328975606859e227d7d9bcaf11475ae02322098e3515d01aad82eb3374a3cc8faf2840b85ca360f62fd47fe99ca997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-impnattypo-doc-fr;en \
texlive-impnattypo-doc"

RDEPENDS:${PN} += ""

inherit rpm
