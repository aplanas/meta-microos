SUMMARY = "Documentation for texlive-pstricks-add"
DESCRIPTION = "This package includes the documentation for texlive-pstricks-add"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-doc-2023.201.3.93svn65067-53.2.noarch.rpm"
RPM_HASH = "989424b8636975db28ad4f92fa96e9caa8711169f73f378e43034b97117bf878b3bc5059ae79e79b105a6ffc5c5cc01f65dda73d9086945dfc078604c5bd4c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
