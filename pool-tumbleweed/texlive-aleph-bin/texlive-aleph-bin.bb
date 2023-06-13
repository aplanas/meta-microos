SUMMARY = "Binary files of aleph"
DESCRIPTION = "Binary files of aleph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-aleph-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "ce4760a2a2e45b2fc7d2860263f2979c97ff7351c4cbce3b8aacb654b9e840b16e68ab3960d6c06d156cd477766ae599e6287fbaf104d9917b390b8a0d2e7c8c"

RPROVIDES:${PN} += "texlive-aleph-bin \
texlive-aleph-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-aleph"

inherit rpm
