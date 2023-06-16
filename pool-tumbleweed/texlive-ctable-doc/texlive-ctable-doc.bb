SUMMARY = "Documentation for texlive-ctable"
DESCRIPTION = "This package includes the documentation for texlive-ctable"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.31svn38672"

RPM_NAME = "texlive-ctable-doc-2023.204.1.31svn38672-54.1.noarch.rpm"
RPM_HASH = "19a9e319440dd663341170ef04f5ce154f5d0dbb2e2e728586af071344fb4c1480f98046c0f97595fd7125f2c1935b22ae601b3c4744c7e9527dda56bca8ca74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctable-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
