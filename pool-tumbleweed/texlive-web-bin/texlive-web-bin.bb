SUMMARY = "Binary files of web"
DESCRIPTION = "Binary files of web"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-web-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "3d89f4d11f77be46ee2fcda3220a608f5790885a13842ec53ce3dcfebc371fcf1b39e9cfc4d37974af948474049e2a08367e0ebcb69c13bf2f10ff9d9792afe6"

RPROVIDES:${PN} += "texlive-web-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-web"

inherit rpm
