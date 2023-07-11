SUMMARY = "Binary files of web"
DESCRIPTION = "Binary files of web"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-web-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "6ce39030e83db053db2d3391654fa00088cdf090a96c05e1e7e1c3e132d6a4955ab640323cf38fc33e344886922144b8cb3366779b0cc23b0b6dfe9867ece87c"

RPROVIDES:${PN} += "texlive-web-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-web"

inherit rpm
