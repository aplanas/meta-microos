SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS (UHD)"
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

RPM_NAME = "osmo-trx-uhd-1.4.0-1.16.aarch64.rpm"
RPM_HASH = "fc1fa540ceff12ec5564022a77ed9be59c950ba5cb687aae649fbcfa56666489aba12a11a687d921bf5531447f7519fe8f30c86263be2fc010197ca26a0fbcbe"

RPROVIDES:${PN} += "config-osmo-trx-uhd \
osmo-trx-uhd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmovty.so.9 \
libstdc++.so.6 \
libtalloc.so.2 \
libuhd.so.4.4.0"

inherit rpm
