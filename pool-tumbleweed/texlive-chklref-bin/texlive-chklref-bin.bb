SUMMARY = "Binary files of chklref"
DESCRIPTION = "Binary files of chklref"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52631"

RPM_NAME = "texlive-chklref-bin-2023.20230311.svn52631-91.1.aarch64.rpm"
RPM_HASH = "902de77b526fcb076780a44e970a8987d55e43821d03d4e0b9de4fdd6561ec7981c05b68e776957ed588e0a238bceb8aac7f4096211a006fd67d0e9c9ace9bba"

RPROVIDES:${PN} += "texlive-chklref-bin \
texlive-chklref-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-chklref"

inherit rpm
