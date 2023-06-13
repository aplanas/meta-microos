SUMMARY = "Extra tools for the Allegro programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. This package contains extra \
tools which are useful for developing Allegro programs."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-tools-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "d5d00e7f2e887ebad06cb5b44faed1fcdb993a0a9520020737ba9019e0ae46971067fd91638351a7221f682175750bfc8b8c55a3d6822dd38d9d5ad33152fcb8"

RPROVIDES:${PN} += "allegro44-tools \
allegro44-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballeg.so.4.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpgalleg.so.4.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
