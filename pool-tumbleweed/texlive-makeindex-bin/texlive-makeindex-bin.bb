SUMMARY = "Binary files of makeindex"
DESCRIPTION = "Binary files of makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-makeindex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "6c28af2b2c0ca39ed833585223b22176895b3e1516c5ad043a1501ca6c8a8b2f2f8ed5816d41d371fca8a4e560fe346d14644e47e820fe9afc39dc63d53eaedd"

RPROVIDES:${PN} += "texlive-makeindex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-makeindex"

inherit rpm
