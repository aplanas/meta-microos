SUMMARY = "Binary files of metafont"
DESCRIPTION = "Binary files of metafont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metafont-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "8c9ebf637db33b49a41e15e75bc4d017dc1fb309367b89ed778fcd896b2ef1dcc1341dc6c7f4c11d0a07e5b5fa7f4c9a9a91418077dae50c2f611e37ccf37768"

RPROVIDES:${PN} += "texlive-metafont-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
texlive-metafont"

inherit rpm
