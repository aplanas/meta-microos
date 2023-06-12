SUMMARY = "Binary files of webquiz"
DESCRIPTION = "Binary files of webquiz"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50419"

RPM_NAME = "texlive-webquiz-bin-2023.20230311.svn50419-91.1.aarch64.rpm"
RPM_HASH = "8d41235bbc778fadeacac90dbc2c561286c1468f74bfc9b0bc8fb6a5169428fca99981111241f97b0c68a6b245a49fc7e15ec5bab4508d8bfa863b2d29b25f0b"

RPROVIDES:${PN} += "texlive-webquiz-bin \
texlive-webquiz-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-webquiz"

inherit rpm
