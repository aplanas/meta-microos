SUMMARY = "Binary files of pdftosrc"
DESCRIPTION = "Binary files of pdftosrc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pdftosrc-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "e7d7ebe0acfd674043fcea8d03b933be9d7155220267e1a97befe92bd4c1c12108dbf5fe9e814928f73cd5e0ec75f69c6b3e91f76b52b7e8d8e73936eb605e86"

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
