SUMMARY = "Binary files of pdflatexpicscale"
DESCRIPTION = "Binary files of pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41779"

RPM_NAME = "texlive-pdflatexpicscale-bin-2023.20230311.svn41779-91.1.aarch64.rpm"
RPM_HASH = "4516bb8d7088d0da85532f268a026543e48c3d693d3809f0fc91f12aab9e570603175bdc5ce63db592f323153f58a4a617d64d906df1719ca6d0b77b532e7b17"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-bin \
texlive-pdflatexpicscale-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-pdflatexpicscale"

inherit rpm
