SUMMARY = "Binary files of dviout-util"
DESCRIPTION = "Binary files of dviout-util"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviout-util-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "68e92ee05533e1b03a2b5a58d8a9bf26360de3ddbf845b03bd0a56bc61a87dd3e5dfd5990a94a832739c5b90a6947f113f8c81a04facae17ad819dd43b2d6e02"

RPROVIDES:${PN} += "texlive-dviout-util-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libptexenc.so.1 \
texlive-dviout-util"

inherit rpm
