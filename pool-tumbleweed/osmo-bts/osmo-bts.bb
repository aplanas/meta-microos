SUMMARY = "Osmocom BTS-Side code (Abis, scheduling)"
DESCRIPTION = "Osmocom BTS-Side code (A-bis, scheduling)."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "osmo-bts-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "65f18d4b27a3b71016d767e72251cb428c7e2fcc7ad92ab60b6d74e61dbfceff1281b754a41bdf10466913b6263e442c5469322af4869712d8d062f46369a377"

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
