SUMMARY = "Binary files of makeindex"
DESCRIPTION = "Binary files of makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-makeindex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "605559e8cf7c470db60bc7f6298b3ce473bdcfcff6257b83e6446f3ecaa57d6257614d0f68ae679ceb2a4a2035a6b394433f1849c7751c285d9bfcab2352f252"

RPROVIDES:${PN} += "texlive-makeindex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-makeindex"

inherit rpm
