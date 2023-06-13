SUMMARY = "Documentation for texlive-color-edits"
DESCRIPTION = "This package includes the documentation for texlive-color-edits"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56707"

RPM_NAME = "texlive-color-edits-doc-2023.201.1.1svn56707-53.1.noarch.rpm"
RPM_HASH = "9b1e3de4b4b503174d9b2e94248248b99196ade51821019a387b7aebd1fb159028218679a4595560008c0d6f48a733a707a6ef5ae9773cba1fa7113fa9086c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-color-edits-doc"

RDEPENDS:${PN} += ""

inherit rpm
