SUMMARY = "Documentation for texlive-lobster2"
DESCRIPTION = "This package includes the documentation for texlive-lobster2"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64442"

RPM_NAME = "texlive-lobster2-doc-2023.209.svn64442-55.1.noarch.rpm"
RPM_HASH = "f182826d32020f4eb85d5398c900b4c434e1975529a0a263d663d8a774e25f256925b8449186f7b5a98330f62baf71b3e9d528c25081dfbf712e627e426073f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lobster2-doc"

RDEPENDS:${PN} += ""

inherit rpm
