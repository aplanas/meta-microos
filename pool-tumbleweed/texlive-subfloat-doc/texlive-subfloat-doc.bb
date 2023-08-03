SUMMARY = "Documentation for texlive-subfloat"
DESCRIPTION = "This package includes the documentation for texlive-subfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn29349"

RPM_NAME = "texlive-subfloat-doc-2023.209.2.14svn29349-58.1.noarch.rpm"
RPM_HASH = "a00dc28e94cf1b4b1d5fa9330d2a437b273f0cbc834667a7803447bd770398cac621665e3281846d9e70fb022083dce3b3a6865121e7cf915c166e3ba4b3199e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
