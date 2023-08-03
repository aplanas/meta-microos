SUMMARY = "Documentation for texlive-association-matrix"
DESCRIPTION = "This package includes the documentation for texlive-association-matrix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64845"

RPM_NAME = "texlive-association-matrix-doc-2023.209.1.1svn64845-54.1.noarch.rpm"
RPM_HASH = "86bb7a30cf56954143c5f161a5367465df2c7d8188ea6a9ca94b428f91fd4223b8d5dad5b9fd7b2525b12874db92fe59248d2a5153ca40d36a26ffaa630316e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-association-matrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
