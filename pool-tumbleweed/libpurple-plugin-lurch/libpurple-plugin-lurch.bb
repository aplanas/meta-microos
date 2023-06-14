SUMMARY = "OMEMO for libpurple"
DESCRIPTION = "This plugin brings Double Ratchet to libpurple applications such as \
Pidgin by implementing OMEMO."
LICENSE = "GPL-3.0-only"

PV = "0.7.0"

RPM_NAME = "libpurple-plugin-lurch-0.7.0-1.10.aarch64.rpm"
RPM_HASH = "639e896995decc55b791ce2b5b25aa0fc18e4c51d4de42bd83cd435caef92aabcb61ac05e7492bd7f32ea95c390e15098f74d9cb1668ff390de8f8c6df94b5bc"

RPROVIDES:${PN} += "libpurple-plugin-lurch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libjabber.so.0 \
libm.so.6 \
libmxml.so.1 \
libsqlite3.so.0"

inherit rpm
