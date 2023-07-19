SUMMARY = "Binary files of kpathsea"
DESCRIPTION = "Binary files of kpathsea"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-kpathsea-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "5b01c3b74a6773f952fedb31f9333a2749c7c3f7c3ccba289de46a184dc62e54c3ae8aa62e66ffc4ca0b9539b190a45aef766d2980400b1127bfc336be19890b"

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
