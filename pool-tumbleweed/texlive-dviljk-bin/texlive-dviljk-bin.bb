SUMMARY = "Binary files of dviljk"
DESCRIPTION = "Binary files of dviljk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviljk-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "56dabe70deedbd070fe458a65e34145258a0ddd5e8f126906f223777849c7a87bbb133370ca020dabf445fcfbded78f6ce736ee511c074e6d9b079ffb13ab398"

RPROVIDES:${PN} += "texlive-bin-dvilj \
texlive-dviljk-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dviljk"

inherit rpm
