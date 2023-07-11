SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-ptex-bin-2023.20230311.svn66084-92.1.aarch64.rpm"
RPM_HASH = "4575bc0eca0049483a0434775e99d933959c87a9e91d66a532d438027b29e0f3a4617bfbe6a979e4970e5e094ab283a41714d9080eee9016a725aafeb69bc445"

RPROVIDES:${PN} += "texlive-ptex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libptexenc.so.1 \
libz.so.1 \
texlive-ptex"

inherit rpm
