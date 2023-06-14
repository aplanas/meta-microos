SUMMARY = "LLVM Execution Engine"
DESCRIPTION = "KLEE is a symbolic virtual machine built on top of the LLVM compiler \
infrastructure, and available under the UIUC open source license. For more \
information on what KLEE is and what it can do, see the OSDI 2008 paper."
LICENSE = "NCSA"

PV = "2.3+20230326"

RPM_NAME = "klee-2.3+20230326-1.1.aarch64.rpm"
RPM_HASH = "0aafac757cdcd28a0afe3643356183aaf85f94170edc26481bd4cb8483ec368171133f13be234d8e8f7301092b7b71385fea740a74fed8f269a7b4058f9e4832"

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
