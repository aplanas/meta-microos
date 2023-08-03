SUMMARY = "Documentation for texlive-elpres"
DESCRIPTION = "This package includes the documentation for texlive-elpres"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn60209"

RPM_NAME = "texlive-elpres-doc-2023.209.1.0.1svn60209-54.1.noarch.rpm"
RPM_HASH = "1ef98fe93e1b658cae16cd0e5ae7256b2e6939a470af3cf2c2279ce6e36870e0f951a8d9f320ed1db3e86d5e3dd4cd754b47aecee17779861ac8bda76004ac0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elpres-doc"

RDEPENDS:${PN} += ""

inherit rpm
