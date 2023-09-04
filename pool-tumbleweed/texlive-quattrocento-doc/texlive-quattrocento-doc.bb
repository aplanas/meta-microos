SUMMARY = "Documentation for texlive-quattrocento"
DESCRIPTION = "This package includes the documentation for texlive-quattrocento"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64372"

RPM_NAME = "texlive-quattrocento-doc-2023.209.svn64372-54.2.noarch.rpm"
RPM_HASH = "1fb6694144089cb7a2fb6d4822664815029d9d5c160e6e5bca18ea1e77a8379c54b805e44555143019306679becaefe0f7f692037e95182a8d9b15eb55c6114a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quattrocento-doc"

RDEPENDS:${PN} += ""

inherit rpm
