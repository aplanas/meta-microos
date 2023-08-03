SUMMARY = "Documentation for texlive-fancybox"
DESCRIPTION = "This package includes the documentation for texlive-fancybox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn18304"

RPM_NAME = "texlive-fancybox-doc-2023.209.1.4svn18304-53.1.noarch.rpm"
RPM_HASH = "1fc898e5103dd8726114c85bf1fd558d0d4c8751bebda8f10577a77002d59e28238c2513df411e1c8621e8b6bf67c78ba3a32242c8eaca96784dd0ff7e3300ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancybox-doc"

RDEPENDS:${PN} += ""

inherit rpm
