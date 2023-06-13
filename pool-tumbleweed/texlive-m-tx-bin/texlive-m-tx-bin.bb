SUMMARY = "Binary files of m-tx"
DESCRIPTION = "Binary files of m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-m-tx-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "f25785c5b15b8d8c8b333734398f51d6e44a4714a04f78c572f5edf056f21c26bcb731f961f0dcf39a7bdf2c51010b19d27a40979d7c47cbcaa2002086d3b77c"

RPROVIDES:${PN} += "texlive-m-tx-bin \
texlive-m-tx-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
texlive-m-tx"

inherit rpm
