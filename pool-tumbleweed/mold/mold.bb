SUMMARY = "A Modern Linker (mold)"
DESCRIPTION = "mold is a faster drop-in replacement for existing Unix linkers. \
It is several times faster than LLVM lld linker, the second-fastest \
open-source linker. \
mold is created for increasing developer productivity by reducing \
build time especially in rapid debug-edit-rebuild cycles."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "mold-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "bbfecb255046a09263fc03381b582ace720255d22b8a0463f5e4c0956fd6b6423411e523cd5c0ec3b87d949d4760e7ae261582495d0beb8b9fc18161b0d08cd5"

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
