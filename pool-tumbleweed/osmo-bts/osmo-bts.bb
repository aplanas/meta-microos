SUMMARY = "Osmocom BTS-Side code (Abis, scheduling)"
DESCRIPTION = "Osmocom BTS-Side code (A-bis, scheduling)."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "osmo-bts-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "8971839fb5738729decdaeeda9ae76a00b4fb78dbd708709a05ecc592386d0fe3391aea6209f0394bf7b829918790fc98dd8376c9638357edb4422bbed5c3583"

RPROVIDES:${PN} += "config(osmo-bts) \
osmo-bts \
osmo-bts(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmoabis.so.10()(64bit) \
libosmocodec.so.0()(64bit) \
libosmocoding.so.0()(64bit) \
libosmocoding.so.0(LIBOSMOCODING_1.0)(64bit) \
libosmocore.so.20()(64bit) \
libosmoctrl.so.0()(64bit) \
libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmotrau.so.2()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
