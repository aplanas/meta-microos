SUMMARY = "Binary files of metapost"
DESCRIPTION = "Binary files of metapost"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metapost-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "4a9c943306dac444afea37c15b1e1e999e8284f5d86dfc0d0e060f8a6d8371025fbaf7b585d16d12506894dab06419677637cb2e3e42dddeca51060dc14214a1"

RPROVIDES:${PN} += "texlive-metapost-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libz.so.1 \
texlive-metapost"

inherit rpm
