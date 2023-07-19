SUMMARY = "Binary files of xpdfopen"
DESCRIPTION = "Binary files of xpdfopen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xpdfopen-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "5a1c2503573b9af64fc9407e498e9a1928b2da6d7bbf5d7b8185ed9370c641055cf7c526440226dff3aa05d9051714a3f82d6ef663d377c4e6100a8e058cabf0"

RPROVIDES:${PN} += "texlive-xpdfopen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
texlive-xpdfopen"

inherit rpm
