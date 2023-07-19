SUMMARY = "Binary files of dtl"
DESCRIPTION = "Binary files of dtl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dtl-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "3d6d94f905283a2ac5561d2040a2e9e5264dc8bccd06610dc6641773ef6a2fd73ed5494e53279cfb7a9c51929c435f974faa22f9d64286a3caa12609403d1da7"

RPROVIDES:${PN} += "texlive-dtl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dtl"

inherit rpm
