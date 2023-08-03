SUMMARY = "Documentation for texlive-messagepassing"
DESCRIPTION = "This package includes the documentation for texlive-messagepassing"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63116"

RPM_NAME = "texlive-messagepassing-doc-2023.209.1.0svn63116-55.1.noarch.rpm"
RPM_HASH = "1c06bcd2b47c24a1c19ed6a8305f3dfd21756cae832eb9c66a4e3a04d06823a173c2cbe524aa7ae2af9fd6c81ced80a625aa5028f7a98e8e782165f2c8848570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-messagepassing-doc"

RDEPENDS:${PN} += ""

inherit rpm
