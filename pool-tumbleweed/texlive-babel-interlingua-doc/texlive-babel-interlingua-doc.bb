SUMMARY = "Documentation for texlive-babel-interlingua"
DESCRIPTION = "This package includes the documentation for texlive-babel-interlingua"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn30276"

RPM_NAME = "texlive-babel-interlingua-doc-2023.209.1.6svn30276-54.1.noarch.rpm"
RPM_HASH = "e3c7ecd4b68ee54279288eed857973b97a2f32e3f43a98fa892e03a4620458273367177a6cd54f2d2c50cebf1558991e38552af1394f85fe87b8c9298027ecc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-interlingua-doc"

RDEPENDS:${PN} += ""

inherit rpm
