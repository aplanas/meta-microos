SUMMARY = "Binary files of pdftosrc"
DESCRIPTION = "Binary files of pdftosrc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pdftosrc-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "b5679f80a3c1eb1211320d5559948e42312a2c3b45a90a4aee06a4f45a1a1238a674f1d211296f24a98ade2890f8984b146c7c35b1eeb58a9f380704ee283879"

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
