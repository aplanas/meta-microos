SUMMARY = "Osmocom SIGTRAN STP (Signaling Transfer Point)"
DESCRIPTION = "This is the Osmocom (Open Source Mobile Communications) \
implementation of a Signaling Transfer Point (STP) for SS7/SIGTRAN \
telecommunication networks. At this point, it is a minimal \
implementation, missing lots of the functionality usually present in \
a STP, such as Global Title Routing, Global Title Translation."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "osmo-stp-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "fc87401e695a39480f65397d41792f2b0f27e103e00bc95594cae568662c699daf987db9186c96333f18228232aaa08f79b35bf5806ad6caa21cbca307da83d5"

RPROVIDES:${PN} += "config(osmo-stp) \
osmo-stp \
osmo-stp(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-sigtran.so.7()(64bit) \
libosmocore.so.20()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
