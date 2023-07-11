SUMMARY = "Binary files of pdftosrc"
DESCRIPTION = "Binary files of pdftosrc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pdftosrc-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "3b510a3f8fbc0c4693528eb977d89f6b0a08eca3f596efdcf79b89cf778b09fc3490b53951aa248e6a9b3b39d895e1069d2552cf4df0becb34977fd2aad791c7"

RPROVIDES:${PN} += "texlive-pdftools-bin-/usr/bin/pdftosrc \
texlive-pdftosrc-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-pdftosrc"

inherit rpm
