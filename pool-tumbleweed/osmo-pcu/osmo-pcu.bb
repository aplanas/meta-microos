SUMMARY = "Osmocom GPRS Packet Control Unit (PCU)"
DESCRIPTION = "Osmocom PCU code (RLC/MAC/PCU) for OpenBTS and OsmoBTS."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "osmo-pcu-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "23d6aedaaa2e4642b6be671552e67ad267642d007f969688f4d8dbb27e1279f7d6111dfa80a48f7f182e1e205c2dd7ae68fd4448fe612aa0b862df4f74d1d691"

RPROVIDES:${PN} += "config(osmo-pcu) \
osmo-pcu \
osmo-pcu(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libosmocore.so.20()(64bit) \
libosmoctrl.so.0()(64bit) \
libosmogb.so.14()(64bit) \
libosmogsm.so.18()(64bit) \
libosmovty.so.9()(64bit) \
libstdc++.so.6()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
