SUMMARY = "Binary files of chktex"
DESCRIPTION = "Binary files of chktex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-chktex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "7aa4792ab7408f4265919fc458aa6ea3fd1b6a178ff6244e016ed0e01f4a206133ad28bc058b917a653459b1cc2057652d28e26a6cb2b3b608ce581cbcbf0c68"

RPROVIDES:${PN} += "texlive-chktex-bin \
texlive-chktex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-chktex"

inherit rpm
