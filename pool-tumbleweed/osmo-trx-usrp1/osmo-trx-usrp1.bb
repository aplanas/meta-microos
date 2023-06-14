SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS (USRP1)"
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

RPM_NAME = "osmo-trx-usrp1-1.4.0-1.15.aarch64.rpm"
RPM_HASH = "2144d26de35190b24df97599d84630d490d59417d91dbdfb3a223e08a87119ff53ac52d1fa986ac94bb946af3f96272ba1a151106a00dff58bc85f85d691a8af"

RPROVIDES:${PN} += "osmo-trx-usrp1"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmovty.so.9 \
libstdc++.so.6 \
libtalloc.so.2 \
libusrp.so.1"

inherit rpm
