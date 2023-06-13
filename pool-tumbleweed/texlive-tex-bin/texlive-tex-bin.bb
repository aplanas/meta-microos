SUMMARY = "Binary files of tex"
DESCRIPTION = "Binary files of tex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "bae24a9d1af6e63e6114e96ae2fa85eb5c39cc5ef32f226e1f6b3b3992edc2b0b16c8225fad51677f47c6a1f11463c25c4cfd851f40cfff04ba9ee512cdbfc9d"

RPROVIDES:${PN} += "texlive-tex-bin \
texlive-tex-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-tex"

inherit rpm
