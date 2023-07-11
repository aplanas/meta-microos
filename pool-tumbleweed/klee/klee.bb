SUMMARY = "LLVM Execution Engine"
DESCRIPTION = "KLEE is a symbolic virtual machine built on top of the LLVM compiler \
infrastructure, and available under the UIUC open source license. For more \
information on what KLEE is and what it can do, see the OSDI 2008 paper."
LICENSE = "NCSA"

PV = "3.0+20230611"

RPM_NAME = "klee-3.0+20230611-1.1.aarch64.rpm"
RPM_HASH = "1162f32c38d776e7bad58dc4e0bcb46f3c4584de238ed953d878856a52af5a7d984cd25adfff071b47786f01059be3a02fe2d7efb490b704113837b1cc25b3bc"

RPROVIDES:${PN} += "klee \
libkleeRuntest.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libcap.so.2 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libstp.so.2.3 \
libtcmalloc.so.4 \
libz.so.1"

inherit rpm
