SUMMARY = "Binary files of dvipos"
DESCRIPTION = "Binary files of dvipos"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-dvipos-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "5deba35cd2a36fe8e652791f13c24f39a1771ca0a82c181e84969b09b9c6037b747e5e3d2301d1dc69f5c270abb320c5f6d1be751d49f57ad3d89681bfd4b8f5"

RPROVIDES:${PN} += "texlive-dvipos-bin \
texlive-dvipos-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkpathsea.so.6()(64bit) \
texlive-dvipos"

inherit rpm
