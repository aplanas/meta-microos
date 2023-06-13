SUMMARY = "Binary files of tex4ht"
DESCRIPTION = "Binary files of tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-tex4ht-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "f703964a27ece7e78908a52e71883decbb69007760d8a0acc0dbde0f6a43815dcbbf80eb2b9c4a28a9fb26b7c3912edc82f78394e0a2a3f308772fc561e2b9ce"

RPROVIDES:${PN} += "texlive-tex4ht-bin \
texlive-tex4ht-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-tex4ht"

inherit rpm
