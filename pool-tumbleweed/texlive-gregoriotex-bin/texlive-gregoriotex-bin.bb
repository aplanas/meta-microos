SUMMARY = "Binary files of gregoriotex"
DESCRIPTION = "Binary files of gregoriotex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gregoriotex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "2b8dbd90311d6e3fa80686e3a7a14bddeea9e89ff3a7a32907fc6e62be3acfe027abaf1a89952ae15d9a02c77ea8206d0ebadb0e8bbd7d918d9174c6247b507f"

RPROVIDES:${PN} += "texlive-gregoriotex-bin \
texlive-gregoriotex-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-gregoriotex"

inherit rpm
