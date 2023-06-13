SUMMARY = "CLI utility to find ip.access compatible BTS"
DESCRIPTION = "Command line utility to find ip.access compatible BTS."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-abisip-find-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "bcbbd81c97b22e4126abddf5ecbae32ef024727ed8cb024adbc72543923864e49bf1348d5392dc1251b7bc825f1c7798a6d44b5cf08ccc974a28bda91c15dbcf"

RPROVIDES:${PN} += "osmo-bsc-abisip-find \
osmo-bsc-abisip-find(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
