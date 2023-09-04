SUMMARY = "Binary files of dvips"
DESCRIPTION = "Binary files of dvips"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvips-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "f853f5fb36baeac13779c55d10cf6f0bc0de5d0481c9eb8e73ea700ebd5d8e7e10c29ddde0d56f8f0305d4425a460b552e2ce2a680a54b3b9460189a5598d95a"

RPROVIDES:${PN} += "texlive-dvips-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvips"

inherit rpm
