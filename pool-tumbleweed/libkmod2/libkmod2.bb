SUMMARY = "Library to interact with Linux kernel modules"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod2-30-6.1.aarch64.rpm"
RPM_HASH = "434e158568aeb5c2af9c6bed50d771a8b2f9c58b4dca5006a429874fb9754e71135afa185870f2a91f96ed02044d7bcdbaa6190ce1dd0efba463f49f4b47eae9"

RPROVIDES:${PN} += "libkmod.so.2 \
libkmod2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
