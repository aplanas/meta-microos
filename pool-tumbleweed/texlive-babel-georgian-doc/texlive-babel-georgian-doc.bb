SUMMARY = "Documentation for texlive-babel-georgian"
DESCRIPTION = "This package includes the documentation for texlive-babel-georgian"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn45864"

RPM_NAME = "texlive-babel-georgian-doc-2023.209.2.2svn45864-54.1.noarch.rpm"
RPM_HASH = "ee8d801bea4cfbde49deb75625c5783ce5960455a6724aeb38e5a834625a2b6ac848828ad4ea210cb2a0a43e68c95ef621fbab2967a8f120e4fd6d0e36150ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-georgian-doc"

RDEPENDS:${PN} += ""

inherit rpm
