SUMMARY = "Osmocom Remote SIM Bank Daemon"
DESCRIPTION = "The remsim-bankd is managing a bank of SIM card readers and their \
respective cards. It establishes a control connection to remsim-server \
and receives inbound connections from remsim-clients."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-remsim-bankd-0.2.2-1.21.aarch64.rpm"
RPM_HASH = "a1c09c70252eeb459a6d834fdb39742f36a01c3c33a2b1d1d805ede32e579b1bf0cc57b5fd013c9cbebaa3a16bf695e2931f66fe367631a8e9b481d8b8c8a4e5"

RPROVIDES:${PN} += "osmo-remsim-bankd \
osmo-remsim-bankd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcsv.so.3()(64bit) \
libosmo-rspro.so.1()(64bit) \
libosmoabis.so.10()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libpcsclite.so.1()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
