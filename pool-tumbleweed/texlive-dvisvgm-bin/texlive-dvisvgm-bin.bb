SUMMARY = "Binary files of dvisvgm"
DESCRIPTION = "Binary files of dvisvgm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66547"

RPM_NAME = "texlive-dvisvgm-bin-2023.20230311.svn66547-91.1.aarch64.rpm"
RPM_HASH = "657cce7740367daa37f605105cfbed55e9635ff8b0d0f399b230d222b1a83dec89eb32c77819e6a3ee04bc4e66afc612dc71abed5693019cc49733bfefef8725"

RPROVIDES:${PN} += "texlive-dvisvgm-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgs.so.9 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libstdc++.so.6 \
libz.so.1 \
texlive-dvisvgm"

inherit rpm
