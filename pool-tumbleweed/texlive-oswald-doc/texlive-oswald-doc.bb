SUMMARY = "Documentation for texlive-oswald"
DESCRIPTION = "This package includes the documentation for texlive-oswald"
LICENSE = "OFL-1.1"

PV = "2023.201.svn60784"

RPM_NAME = "texlive-oswald-doc-2023.201.svn60784-54.1.noarch.rpm"
RPM_HASH = "a3bfe0296be0c950d19af966ed580b714c672f4a677b5835e40bac5b296525f8c58e7b3fa56d24df9c199de76969d0b9792e837cedefd097ffafebb3ad634d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oswald-doc"

RDEPENDS:${PN} += ""

inherit rpm
