SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mflua-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "0ce746a6127a7e31f94cb2ad2a06b8c53d3f30e7409e96fee5a80357e7bb058e5a44b110bc967bb60ed97498135a3f2e0217fd268fa735502ee521630af537fd"

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
