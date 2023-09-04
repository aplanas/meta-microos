SUMMARY = "Binary files of dvipdfmx"
DESCRIPTION = "Binary files of dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipdfmx-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "20d36c341e2b795066b7b09ed4d7e2a4aa85fcb4d31a5f981aeb329e223723af509594a743c819c3bb3b240de8db3066d109525233dbe3502d895794688f41a2"

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
