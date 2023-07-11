SUMMARY = "Osmocom CI: Bring up only OML without RSL"
DESCRIPTION = "This is used only in integration testing, where in the TTCN-3 testsuite \
we currently have no A-bis OML implementation, but only a RSL one."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-bts-omldummy-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "f2be493a3a98d73d698528c23322847b722eb5196461d5d3495f3de656fd121f4e7b7e8093362273d2c395d866387ceb9dee0207168f99b570a5ff7148ee31dc"

RPROVIDES:${PN} += "osmo-bts-omldummy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmotrau.so.2 \
libtalloc.so.2"

inherit rpm
