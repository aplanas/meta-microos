SUMMARY = "Library to interact with Linux kernel modules"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod2-30-7.1.aarch64.rpm"
RPM_HASH = "a6c4454fe6ec8eca893a9769b888954ae9fcc05dca372998aa10c485e71959931531c828722d817eb98cd477d3097b93417d3881695f3d1e2e1b04c52027ff56"

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
