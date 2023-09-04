SUMMARY = "A Modern Linker (mold)"
DESCRIPTION = "mold is a faster drop-in replacement for existing Unix linkers. \
It is several times faster than LLVM lld linker, the second-fastest \
open-source linker. \
mold is created for increasing developer productivity by reducing \
build time especially in rapid debug-edit-rebuild cycles."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "mold-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "db87f649753d6fce2bb3eba22c8a21984a593c4610aed2a294ac3dcbf03acdec09b3e694114d155c3e82b1e5f274ce103a3e7310e248363a423f11300fc363a7"

RPROVIDES:${PN} += "mold"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
