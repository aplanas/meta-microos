SUMMARY = "Documentation for texlive-biblatex-shortfields"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-shortfields"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn45858"

RPM_NAME = "texlive-biblatex-shortfields-doc-2023.201.1.0.1svn45858-53.1.noarch.rpm"
RPM_HASH = "2accbf45a75f0cf9c51b4dd21c06db8a4a7acd553638ad5a5ec2210fa880ad3c6ce5c49cd20774831b74e94c407b3cc2677583b553a465ac61f444d4c7a3c627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-shortfields-doc"

RDEPENDS:${PN} += ""

inherit rpm
