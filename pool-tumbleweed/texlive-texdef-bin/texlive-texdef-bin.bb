SUMMARY = "Binary files of texdef"
DESCRIPTION = "Binary files of texdef"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45011"

RPM_NAME = "texlive-texdef-bin-2023.20230311.svn45011-93.1.aarch64.rpm"
RPM_HASH = "c9c786f737b187733774aa1be18be62a56c795213c7bc5576eea50885a8685f29c5575e70508e2a90693af6d03bb6ca661dd8363ecd0c4fe89c86757568b1eaf"

RPROVIDES:${PN} += "texlive-texdef-bin"

RDEPENDS:${PN} += "texlive-texdef"

inherit rpm
