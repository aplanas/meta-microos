SUMMARY = "Osmocom's PCAP client and server"
DESCRIPTION = "Osmocom tools to help with pcap tracing. \
Run osmo_pcap_client locally and send traces to a different system."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "osmo-pcap-0.1.3-1.11.aarch64.rpm"
RPM_HASH = "1757bdbe02d12a035ff995a673e7453b004931ac6db4105b23c90f498f5ff0dbd0d2f79e878946a9d429d04b6636b7fe244b0db9405c2134081b54bbb1a5001e"

RPROVIDES:${PN} += "config-osmo-pcap \
osmo-pcap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libpcap.so.1 \
libtalloc.so.2 \
libzmq.so.5"

inherit rpm
