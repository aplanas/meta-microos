SUMMARY = "Binary files of dvipdfmx"
DESCRIPTION = "Binary files of dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipdfmx-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "3ee575d2a0e26e865e46aaa7d3b74e07b2040440b8eb9f64799b58e049769b88c42b90922681b606e330188225e579083f81c7d7febba362182308c5c3ac2f13"

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
