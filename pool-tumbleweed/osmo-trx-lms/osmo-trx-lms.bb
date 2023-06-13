SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS (LimeSuite)"
DESCRIPTION = "OsmoTRX is a software-defined radio transceiver that implements the Layer 1 \
physical layer of a BTS comprising the following 3GPP specifications: \
 \
TS 05.01 'Physical layer on the radio path' \
TS 05.02 'Multiplexing and Multiple Access on the Radio Path' \
TS 05.04 'Modulation' \
TS 05.10 'Radio subsystem synchronization' \
 \
In this context, BTS is 'Base transceiver station'. It's the stations that \
connect mobile phones to the mobile network. \
 \
3GPP is the '3rd Generation Partnership Project' which is the collaboration \
between different telecommunication associations for developing new \
generations of mobile phone networks. (post-2G/GSM)"
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-trx-lms-1.4.0-1.15.aarch64.rpm"
RPM_HASH = "23f692f59c73d35fbb873880f5712acc1b002664394ebb85101f63e6500c6c76a43167346015dbc82c0fbb77ba66185594d0123ce335895e5c5b619c8f618c35"

RPROVIDES:${PN} += "config(osmo-trx-lms) \
osmo-trx-lms \
osmo-trx-lms(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libLimeSuite.so.22.09-1()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libosmocore.so.20()(64bit) \
libosmoctrl.so.0()(64bit) \
libosmogsm.so.18()(64bit) \
libosmovty.so.9()(64bit) \
libstdc++.so.6()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
