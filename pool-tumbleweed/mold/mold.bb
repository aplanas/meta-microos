SUMMARY = "A Modern Linker (mold)"
DESCRIPTION = "mold is a faster drop-in replacement for existing Unix linkers. \
It is several times faster than LLVM lld linker, the second-fastest \
open-source linker. \
mold is created for increasing developer productivity by reducing \
build time especially in rapid debug-edit-rebuild cycles."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0"

RPM_NAME = "mold-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "a5662842ad15755d69370726afe9a8084b6dc58745a9b16c52860b535879ee8cfa1ea96cb76aa45f1022ace0b2eb6ea4dd28d4226cedd5e5fa4dddb57241bfd2"

RPROVIDES:${PN} += "mold"

RDEPENDS:${PN} += "/bin/sh \
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
