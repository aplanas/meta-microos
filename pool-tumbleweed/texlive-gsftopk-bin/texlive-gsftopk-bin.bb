SUMMARY = "Binary files of gsftopk"
DESCRIPTION = "Binary files of gsftopk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gsftopk-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "7a4569d0d3b4ceb8ad3663d4eeec4c628ba4fcd6ec63832ad41337382d4161b2172264b2955a505342da6c4c51c05f14c4953a9767f1809141cd1d8971e534ee"

RPROVIDES:${PN} += "texlive-gsftopk-bin \
texlive-gsftopk-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-gsftopk"

inherit rpm
