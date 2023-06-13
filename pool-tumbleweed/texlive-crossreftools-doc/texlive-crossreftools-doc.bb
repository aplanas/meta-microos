SUMMARY = "Documentation for texlive-crossreftools"
DESCRIPTION = "This package includes the documentation for texlive-crossreftools"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn55879"

RPM_NAME = "texlive-crossreftools-doc-2023.204.1.0svn55879-54.1.noarch.rpm"
RPM_HASH = "53a7330fb91dc26b22d5418369062f592ff1083e2cf005b733d0705f75eec6cca73c45d1d4bcce077daae3ec38d26d226f95e504fd3e669f2a416f266305bf26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossreftools-doc"

RDEPENDS:${PN} += ""

inherit rpm
