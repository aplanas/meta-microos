SUMMARY = "Library to interact with Linux kernel modules"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod2-30-5.1.aarch64.rpm"
RPM_HASH = "42de7ad5e224505235e3263c49a6295bd7f0bbf6726f192d7a25797f59d65373d1941253f54e4852f108c2a75a84e31c069c69bcdae27d03528c8650a6fe135d"

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
