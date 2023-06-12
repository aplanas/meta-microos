SUMMARY = "Tools for Working With jigdo Files"
DESCRIPTION = "Jigit is an interactive wrapper around mkimage to ease the download or upgrade \
of existing CDs and CD images."
LICENSE = "GPL-2.0-only"

PV = "1.22"

RPM_NAME = "jigit-1.22-1.10.aarch64.rpm"
RPM_HASH = "3aa957bc204fb3da7170842bd0974544ede6fe99662c9349d9070632d09176267b0a8111d34a6a71c96086655b59446013c88f50f36c46c2378cf9d91ae47724"

RPROVIDES:${PN} += "jigit \
jigit(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit)"

inherit rpm
