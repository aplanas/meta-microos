SUMMARY = "Binary files of velthuis"
DESCRIPTION = "Binary files of velthuis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-velthuis-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "2052bad73f50165bffb6a669abbc59df196c33d83b81ac1afc321d431afa45e75e30792da259e5da8ad763df3fe07c4ff0e69542dadbaed346efd38276c5d7d8"

RPROVIDES:${PN} += "texlive-velthuis-bin \
texlive-velthuis-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
texlive-velthuis"

inherit rpm
