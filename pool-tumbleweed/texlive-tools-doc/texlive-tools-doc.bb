SUMMARY = "Documentation for texlive-tools"
DESCRIPTION = "This package includes the documentation for texlive-tools"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64892"

RPM_NAME = "texlive-tools-doc-2023.201.svn64892-52.1.noarch.rpm"
RPM_HASH = "79e3ec16dfb3ad8b78a7987f8b1bc35cc4dd1d4fcb8282628e5e2de7da0b555f6f6daa7e273614fce8487851639f7b046d11860cd6686ebfd3024f035c2b9c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tools-doc"
RDEPENDS:${PN} += ""

inherit rpm
