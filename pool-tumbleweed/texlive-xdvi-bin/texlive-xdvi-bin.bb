SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-xdvi-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "4e972d417014decacde4eb00c85fbda4140c0c4cb587fc451710dbd3f1864af9e52230d9b722e83580f1d04d15f628bf538d06bc2d96dba1c2b2d7d4e833cec2"

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
