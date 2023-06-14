SUMMARY = "Osmocom CI: Bring up only OML without RSL"
DESCRIPTION = "This is used only in integration testing, where in the TTCN-3 testsuite \
we currently have no A-bis OML implementation, but only a RSL one."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-bts-omldummy-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "43af80c067bc4ceec403359739838eda013c8594ece0041851163854f18c9cff3056cfcc3593ea8fcf333019ade5ab2b97f3ead061684eeb3a03c4a131f178a7"

RPROVIDES:${PN} += "osmo-bts-omldummy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmotrau.so.2 \
libtalloc.so.2"

inherit rpm
