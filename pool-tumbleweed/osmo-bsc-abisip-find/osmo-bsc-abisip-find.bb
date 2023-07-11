SUMMARY = "CLI utility to find ip.access compatible BTS"
DESCRIPTION = "Command line utility to find ip.access compatible BTS."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-abisip-find-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "663cebec71a723d1bfc7c327b54f33f7d280b3f7cb50a1d32067c6d4dc8af7426cfbeccdf05b5adacac2ccd8def84403c3c10bfb4636de05702b6cbadbe9d7cc"

RPROVIDES:${PN} += "osmo-bsc-abisip-find"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libtalloc.so.2"

inherit rpm
