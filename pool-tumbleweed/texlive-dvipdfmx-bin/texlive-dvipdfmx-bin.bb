SUMMARY = "Binary files of dvipdfmx"
DESCRIPTION = "Binary files of dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipdfmx-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "c1d1063601bad590acc60e15a5a539c0a173fa7ba6bde4f74c9b1f611b5bac52a199170fda11272a3ee89ea026e727fa158734133e8e8e68925d4a8f68155873"

RPROVIDES:${PN} += "texlive-dvipdfm-bin \
texlive-dvipdfmx-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpaper.so.2 \
libpng16.so.16 \
libz.so.1 \
texlive-dvipdfmx \
texlive-scripts \
texlive-xetex-bin"

inherit rpm
