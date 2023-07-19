SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mflua-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "a9a9bd22ff222462fde8b96e23d462438911353cfb564c7921871c6a25825e08d98306197fecb61a9e6c8985a65fc1f46b4f24d0e6181314c94493f2a65315af"

RPROVIDES:${PN} += "texlive-mflua-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libtexlua53.so.5 \
libtexluajit.so.2 \
texlive-mflua"

inherit rpm
