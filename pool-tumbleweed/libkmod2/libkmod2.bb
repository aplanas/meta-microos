SUMMARY = "Library to interact with Linux kernel modules"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod2-30-8.1.aarch64.rpm"
RPM_HASH = "10531f4b24ef2799a54805414dc7059beba92a6c04dd52fa6c1ae7b662d64942016d1f8f13bb02a95029effdae82a16f337f82f17259ea68c8aafb959391e32c"

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
