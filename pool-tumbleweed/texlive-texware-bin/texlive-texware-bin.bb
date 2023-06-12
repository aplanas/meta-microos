SUMMARY = "Binary files of texware"
DESCRIPTION = "Binary files of texware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-texware-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "60b108b74aed1cc1068cf426c9b6b6f5fc1d307550dfee0a2f0dcda34e9551ddd2e5a394d8605d5e4ded9f579192617a8acd2e1eda44a42a8de3094f7a2cc2a2"

RPROVIDES:${PN} += "texlive-texware-bin \
texlive-texware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-texware"

inherit rpm
