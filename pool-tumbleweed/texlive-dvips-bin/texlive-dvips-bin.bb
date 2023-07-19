SUMMARY = "Binary files of dvips"
DESCRIPTION = "Binary files of dvips"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvips-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "4c9b7cd5feb821acd2f73c91a3e56b358e7da55c0bd447ee9809a1ef17d9e6642135d90a3abfec5893dd2ae6cca5ec3352dee51b07199d625c5aed8f49b96ce9"

RPROVIDES:${PN} += "texlive-dvips-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvips"

inherit rpm
