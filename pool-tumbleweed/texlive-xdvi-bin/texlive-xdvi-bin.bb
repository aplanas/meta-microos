SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-xdvi-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "0ccccd7fb2213ed47fee7a51cf752edb5f81f7f80b5f5a85cbbef0ea84d4a5dde8ccb463063ead6b6c2c6822bccdc83b5f95942214413a739220fa8811446d4f"

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
