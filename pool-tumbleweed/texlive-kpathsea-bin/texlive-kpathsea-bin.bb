SUMMARY = "Binary files of kpathsea"
DESCRIPTION = "Binary files of kpathsea"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-kpathsea-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "6e57795d864ea88591adb3e3746b5effcdee878e511e665f5aec230dffafd7c7cf6b9978a40bba3a6e8d021b46818e530832071c8fee509ff31bf3f70fb19b4b"

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
