SUMMARY = "Binary files of aleph"
DESCRIPTION = "Binary files of aleph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-aleph-bin-2023.20230311.svn66084-92.1.aarch64.rpm"
RPM_HASH = "e971964a0770da2640c90289507a54df23843e7ef9495a2c491c826c19d4c93a20e1e1a0dc71627032f3528614a3644c71b4a269bfcb2b928cb7f507522ac7fb"

RPROVIDES:${PN} += "texlive-aleph-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-aleph"

inherit rpm
