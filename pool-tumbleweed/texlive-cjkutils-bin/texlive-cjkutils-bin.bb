SUMMARY = "Binary files of cjkutils"
DESCRIPTION = "Binary files of cjkutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cjkutils-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "9ed4f088783fcb8d56a0326282ff644c3a58991c7f2fb33d26a6dfca55b1e05c0e25249c04da9602e5711c50aaea420e68b8046aa0b6bf6808a82742a0eb9812"

RPROVIDES:${PN} += "texlive-cjkutils-bin \
texlive-cjkutils-bin(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-cjkutils"

inherit rpm
