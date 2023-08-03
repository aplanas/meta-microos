SUMMARY = "Documentation for texlive-crimson"
DESCRIPTION = "This package includes the documentation for texlive-crimson"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64559"

RPM_NAME = "texlive-crimson-doc-2023.209.svn64559-55.1.noarch.rpm"
RPM_HASH = "06ca3cdfa7c1eeda29f6fbcae8c3f51a4858dd6f85c070733bd4e70ad8cc0a0dfa3af83933e4297813231542d093a32bd6e7ba0e7abcf553d314d7367a8a2244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crimson-doc"

RDEPENDS:${PN} += ""

inherit rpm
