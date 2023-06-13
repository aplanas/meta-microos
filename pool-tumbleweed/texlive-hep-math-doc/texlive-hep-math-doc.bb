SUMMARY = "Documentation for texlive-hep-math"
DESCRIPTION = "This package includes the documentation for texlive-hep-math"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64905"

RPM_NAME = "texlive-hep-math-doc-2023.201.1.1svn64905-53.1.noarch.rpm"
RPM_HASH = "8d22100f4ed4591f82fa4f50289379a9c4e75c106fe8105d41a6a5d849190e73c54161663023dce0a2d621ddac0238b86569a72483209369908accea90e23ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
