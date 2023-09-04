SUMMARY = "Binary files of dviljk"
DESCRIPTION = "Binary files of dviljk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviljk-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "fa44ffb876cd2c27e0704d4c8105d8352bd7d8edba7894a5636633e7845da079e5da74acb3ea54c444aee5538e1929018d45c02f4a153bc89da75ed0ed875f9c"

RPROVIDES:${PN} += "texlive-bin-dvilj \
texlive-dviljk-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dviljk"

inherit rpm
