SUMMARY = "Binary files of dvipng"
DESCRIPTION = "Binary files of dvipng"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipng-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "fb3b36c329f2954a96c870e9a0457ed3deaaef49f2a3fb60f655d68b617e6f6f587ec1481da855d58047f92533a9f3be114abbda8fb66dbdfd5d4eb3dbcb5bc7"

RPROVIDES:${PN} += "texlive-dvipng-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgd.so.3 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvipng"

inherit rpm
