SUMMARY = "Osmocom BTS-Side code (Abis, scheduling)"
DESCRIPTION = "Osmocom BTS-Side code (A-bis, scheduling)."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "osmo-bts-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "8971839fb5738729decdaeeda9ae76a00b4fb78dbd708709a05ecc592386d0fe3391aea6209f0394bf7b829918790fc98dd8376c9638357edb4422bbed5c3583"

RPROVIDES:${PN} += "config-osmo-bts \
osmo-bts"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocodec.so.0 \
libosmocoding.so.0 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmotrau.so.2 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
