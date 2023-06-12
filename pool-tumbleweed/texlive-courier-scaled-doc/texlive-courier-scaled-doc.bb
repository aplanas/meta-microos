SUMMARY = "Documentation for texlive-courier-scaled"
DESCRIPTION = "This package includes the documentation for texlive-courier-scaled"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn24940"

RPM_NAME = "texlive-courier-scaled-doc-2023.204.svn24940-54.1.noarch.rpm"
RPM_HASH = "7d0f419f6379ae61deb608e72a067140dc910684bdc6fa40287c46c55c1baba06d7a782ccc6a3063d9a65fcfeb46deb510110556927e3ea1181146dad521a264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courier-scaled-doc"
RDEPENDS:${PN} += ""

inherit rpm
