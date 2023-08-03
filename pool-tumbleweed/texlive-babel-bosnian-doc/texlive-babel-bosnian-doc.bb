SUMMARY = "Documentation for texlive-babel-bosnian"
DESCRIPTION = "This package includes the documentation for texlive-babel-bosnian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38174"

RPM_NAME = "texlive-babel-bosnian-doc-2023.209.1.1svn38174-54.1.noarch.rpm"
RPM_HASH = "60c6acc60ec77edbe439e0547ca962d7b3c5566448a201d8e799af7543014869b27503230195eb85985289d0f201b043ce388f9721359e8009fa45ff38837372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-bosnian-doc"

RDEPENDS:${PN} += ""

inherit rpm
