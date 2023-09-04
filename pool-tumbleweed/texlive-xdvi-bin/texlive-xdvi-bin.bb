SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-xdvi-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "c08bc9fc7a7bd406a19768efeb9032e1dea274bf174f70f4ca0563e045ade31bd36e85b298f7b701b8c848a8c948232eb5045358831288c012e141f31ac4a6ee"

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
