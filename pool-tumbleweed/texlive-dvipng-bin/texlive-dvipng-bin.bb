SUMMARY = "Binary files of dvipng"
DESCRIPTION = "Binary files of dvipng"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipng-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "7261608a4484aa7ab7179da7ea3d9fb4cec9d427144b7bd1858ae605315d535242b41cdaaf8ee4ccb9987788f348c1bcb628c30cec5bd61897782a9edb31d725"

RPROVIDES:${PN} += "texlive-dvipng-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgd.so.3 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvipng"

inherit rpm
