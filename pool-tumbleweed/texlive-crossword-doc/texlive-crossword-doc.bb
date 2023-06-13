SUMMARY = "Documentation for texlive-crossword"
DESCRIPTION = "This package includes the documentation for texlive-crossword"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.11svn64375"

RPM_NAME = "texlive-crossword-doc-2023.204.1.11svn64375-54.1.noarch.rpm"
RPM_HASH = "3096321317d562e0ff2e3d83d0eaed0d8db93ba3d1edb29472aeb4cff9a7bd89d9b69d2c79780d213991be02c7e5a66baa34518934d12539d81ccdbe8fb5dcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossword-doc"

RDEPENDS:${PN} += ""

inherit rpm
