SUMMARY = "Binary files of kpathsea"
DESCRIPTION = "Binary files of kpathsea"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-kpathsea-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "453019478fa642a3ae63090bafce725709583253aaee4a7952ff42f32303ac9118d4d375698b7f0191ea11a15fa5fb4ac210f448a875fce28e85986f903de14a"

RPROVIDES:${PN} += "texlive-kpathsea-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
group-mktex \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
permissions \
texlive-filesystem \
texlive-gsftopk-bin \
texlive-kpathsea \
texlive-scripts-bin \
user-mktex"

inherit rpm
