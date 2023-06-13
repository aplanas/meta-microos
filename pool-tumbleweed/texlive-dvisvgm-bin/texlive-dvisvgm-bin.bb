SUMMARY = "Binary files of dvisvgm"
DESCRIPTION = "Binary files of dvisvgm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66547"

RPM_NAME = "texlive-dvisvgm-bin-2023.20230311.svn66547-91.1.aarch64.rpm"
RPM_HASH = "657cce7740367daa37f605105cfbed55e9635ff8b0d0f399b230d222b1a83dec89eb32c77819e6a3ee04bc4e66afc612dc71abed5693019cc49733bfefef8725"

RPROVIDES:${PN} += "texlive-dvisvgm-bin \
texlive-dvisvgm-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgs.so.9()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libpotrace.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
texlive-dvisvgm"

inherit rpm
