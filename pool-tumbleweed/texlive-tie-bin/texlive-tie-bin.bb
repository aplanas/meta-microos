SUMMARY = "Binary files of tie"
DESCRIPTION = "Binary files of tie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tie-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "efd471c762e909be181174217c530d578cb930785c7dfc93479a230c1638cfb2dfee0735c221df55274016fce35e1378fb406e4e7f4f4b8b477dcfd6c9163d29"

RPROVIDES:${PN} += "texlive-tie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-tie"

inherit rpm
