SUMMARY = "Documentation for texlive-pacioli"
DESCRIPTION = "This package includes the documentation for texlive-pacioli"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24947"

RPM_NAME = "texlive-pacioli-doc-2023.209.svn24947-52.1.noarch.rpm"
RPM_HASH = "cf76d9c0c579ca21a94860ea0239c7d08deb937289678a8cd8aa6c406e7620fdb82f9c3d63fefc2aeba100fdfa745e04ae813f372b160662c53a92250e302433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pacioli-doc"

RDEPENDS:${PN} += ""

inherit rpm
