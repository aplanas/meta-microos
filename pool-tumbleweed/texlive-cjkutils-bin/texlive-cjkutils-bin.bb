SUMMARY = "Binary files of cjkutils"
DESCRIPTION = "Binary files of cjkutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cjkutils-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "68e62bf13507acbf4b4bd36398020387603f683ede31f90eeaa5bcdc4e3f70cea3b9c40423f267a77d987dfbf40ae2c346974bcd857e34f28f79d653df4a1827"

RPROVIDES:${PN} += "texlive-cjkutils-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cjkutils"

inherit rpm
