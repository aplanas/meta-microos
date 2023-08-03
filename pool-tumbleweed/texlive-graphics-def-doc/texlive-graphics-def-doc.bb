SUMMARY = "Documentation for texlive-graphics-def"
DESCRIPTION = "This package includes the documentation for texlive-graphics-def"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64487"

RPM_NAME = "texlive-graphics-def-doc-2023.209.svn64487-54.1.noarch.rpm"
RPM_HASH = "50ff6a225f22e15930c5552e36dfa2adf15afcd134de423c701d6ab413ff5ce64209e84c05657db36ee7ac81898c4b246202953a81be3cb694530d27f7d5c69c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-def-doc"

RDEPENDS:${PN} += ""

inherit rpm
