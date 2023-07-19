SUMMARY = "Binary files of ps2eps"
DESCRIPTION = "Binary files of ps2eps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-ps2eps-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "9e3095a6e05464acd81680f4e87d216ce42b1895c79e65f711da1aaab352474c1d1ddbf9da81d4f8bb9b5940580ca53db2342222c8d30e4a62690fc72934ddfd"

RPROVIDES:${PN} += "texlive-ps2eps-bin \
texlive-pstools-bin-/usr/bin/bbox \
texlive-pstools-bin-/usr/bin/ps2eps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-ps2eps"

inherit rpm
