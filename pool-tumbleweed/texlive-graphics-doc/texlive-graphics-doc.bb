SUMMARY = "Documentation for texlive-graphics"
DESCRIPTION = "This package includes the documentation for texlive-graphics"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66204"

RPM_NAME = "texlive-graphics-doc-2023.201.svn66204-53.2.noarch.rpm"
RPM_HASH = "75cf6be89248394cb6c028184b5dd4a2d9d3738ba726ec19d0531cf5d8d3b5edf68f043a0093dd6fc219886a3f8b3a18b079c626b8cdc62945bfe2c75b1b107b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
