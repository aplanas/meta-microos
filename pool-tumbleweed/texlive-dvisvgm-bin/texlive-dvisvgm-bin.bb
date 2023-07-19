SUMMARY = "Binary files of dvisvgm"
DESCRIPTION = "Binary files of dvisvgm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66547"

RPM_NAME = "texlive-dvisvgm-bin-2023.20230311.svn66547-93.1.aarch64.rpm"
RPM_HASH = "b79e398d48d7eb32a96fa62a8172cf5e4e24d81a174a34d31f4b5590550f6e4838b6d67a264e7446c29125bd62d49560d8165991f6e1c720a237bdf1a1445f04"

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
