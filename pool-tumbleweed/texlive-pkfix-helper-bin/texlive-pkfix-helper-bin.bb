SUMMARY = "Binary files of pkfix-helper"
DESCRIPTION = "Binary files of pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-pkfix-helper-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "26ace810c86ec9198966bb6265d9d2b80c19ff52a6f868061269627256b2e9172a6f2de6e638a0ff4a496f294c63744df0c931a3deb762a1434bf1c9964f5cde"

RPROVIDES:${PN} += "texlive-pkfix-helper-bin"

RDEPENDS:${PN} += "texlive-pkfix-helper"

inherit rpm
