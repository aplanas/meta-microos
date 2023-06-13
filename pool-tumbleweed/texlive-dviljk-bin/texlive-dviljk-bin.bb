SUMMARY = "Binary files of dviljk"
DESCRIPTION = "Binary files of dviljk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviljk-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "4f328950ccd6c3715a4a56f3e2399deabf86b8f78c65f7b1e94a27c6d5e6ec5a37fb4ec7e6a6f730e378bc9c31aea7b700efadc8ea844b63ea198b35ae3b4fea"

RPROVIDES:${PN} += "texlive-bin-dvilj \
texlive-dviljk-bin \
texlive-dviljk-bin(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkpathsea.so.6()(64bit) \
texlive-dviljk"

inherit rpm
