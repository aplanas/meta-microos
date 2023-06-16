SUMMARY = "Documentation for texlive-biblatex-software"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-software"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2_5svn64030"

RPM_NAME = "texlive-biblatex-software-doc-2023.201.1.2_5svn64030-53.1.noarch.rpm"
RPM_HASH = "2fea868a868390831c2c312d0c874c2e6fd67c8ab3f1b2a1372c1bcb1d429b71ecd5838e3df54b508df0d2613144a98ec47810952811ffd53776486bd6a248bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-software-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
