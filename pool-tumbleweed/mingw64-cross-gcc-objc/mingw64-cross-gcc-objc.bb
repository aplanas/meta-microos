SUMMARY = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-objc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "6709ef06db5a2fb0c8eaee66c4509251dd61f7b88ca475e1f918a27936f064aafcca29cc2efc61183d0f86ed07f8b3da1d0ce4f67985f103c55c6c8c714c6517"

RPROVIDES:${PN} += "mingw64-cross-gcc-objc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
