SUMMARY = "Binary files of patgen"
DESCRIPTION = "Binary files of patgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-patgen-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "8d033f55bbf4cfe04bc9255c59ba5362000055933b1408b6d2d42c44415aa8fc81b173e9e616bcc7019528d5cc8da89a78b700f24b05bcd4339074b14ca2824c"

RPROVIDES:${PN} += "texlive-patgen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-patgen"

inherit rpm
