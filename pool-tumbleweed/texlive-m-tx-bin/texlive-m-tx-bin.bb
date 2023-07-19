SUMMARY = "Binary files of m-tx"
DESCRIPTION = "Binary files of m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-m-tx-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "6d582e67b2563c1d0c1dee4f0eb90a7b9878ba31aef592e77f0ce152b2db5dcf2df08631f5d21612a4f18b2b40f42c9c59e29b55128f88bf76c6207b225b9396"

RPROVIDES:${PN} += "texlive-m-tx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-m-tx"

inherit rpm
