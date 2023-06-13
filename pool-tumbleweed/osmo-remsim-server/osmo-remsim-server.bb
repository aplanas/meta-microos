SUMMARY = "Osmocom Remote SIM Central Server"
DESCRIPTION = "The remsim-server is the central element of a osmo-remsim deployment, \
it maintains a list of clients + bankds connected to it, as well as the \
dynamic SIM card mappings between them."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-remsim-server-0.2.2-1.21.aarch64.rpm"
RPM_HASH = "ff273c40badc88f2f5d8108cadf0b13193e22da15575826e26834962071d1ee5bbac9c80b7849eb383f9fb50f0ee3db7b86a0d372eeab8cccab19ea82e171eee"

RPROVIDES:${PN} += "osmo-remsim-server \
osmo-remsim-server(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjansson.so.4()(64bit) \
liborcania.so.2.3()(64bit) \
libosmo-rspro.so.1()(64bit) \
libosmoabis.so.10()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libtalloc.so.2()(64bit) \
libulfius.so.2.7()(64bit)"

inherit rpm
