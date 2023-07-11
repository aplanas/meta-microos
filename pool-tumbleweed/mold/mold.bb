SUMMARY = "A Modern Linker (mold)"
DESCRIPTION = "mold is a faster drop-in replacement for existing Unix linkers. \
It is several times faster than LLVM lld linker, the second-fastest \
open-source linker. \
mold is created for increasing developer productivity by reducing \
build time especially in rapid debug-edit-rebuild cycles."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0"

RPM_NAME = "mold-1.11.0-1.4.aarch64.rpm"
RPM_HASH = "9b3072fc64ac04ed22daf1c19f5e7976c39cbf348b19c76b341575bfcce78c4b848446b169156c16a3f7d742fcef37070286e6af0269feb32935336bbfd8825c"

RPROVIDES:${PN} += "mold"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
