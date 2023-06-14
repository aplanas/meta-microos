SUMMARY = "Osmocom's PCAP client and server"
DESCRIPTION = "Osmocom tools to help with pcap tracing. \
Run osmo_pcap_client locally and send traces to a different system."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "osmo-pcap-0.1.3-1.10.aarch64.rpm"
RPM_HASH = "90af10bb98eba53b98c046012aa84dedc102abcdbd3b4ff1533fddd8f9ab68b5c65ddd43b327ae27b79188aa6854504b5a31e19665d7b6c7f323e4003717db53"

RPROVIDES:${PN} += "config-osmo-pcap \
osmo-pcap"

RDEPENDS:${PN} += "/bin/sh \
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
