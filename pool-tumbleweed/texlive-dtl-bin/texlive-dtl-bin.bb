SUMMARY = "Binary files of dtl"
DESCRIPTION = "Binary files of dtl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dtl-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "90676c94274bcac8ff97d6f18f3fc53bdb2774cb0f80c9c557c32fe986445a4c94757511995d2df2d5c6c4cf52afec8b2d53f96cd8d868c9ec8f05f0c3fe9ead"

RPROVIDES:${PN} += "texlive-dtl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dtl"

inherit rpm
