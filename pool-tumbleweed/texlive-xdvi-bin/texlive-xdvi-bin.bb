SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-xdvi-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "c981edb14ce861f8cf0a6a1ab1c2d8171ec598959c0cf246bc2cffe475bb676a0f42e7502632bb0c674c2c50a0534eaba7ec55e698c5f979923a6f4ff195996a"

RPROVIDES:${PN} += "texlive-xdvi-bin"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXi.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-xdvi"

inherit rpm
