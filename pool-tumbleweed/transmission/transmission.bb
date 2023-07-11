SUMMARY = "A BitTorrent client with multiple UIs"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-4.0.3-2.2.aarch64.rpm"
RPM_HASH = "706f77de5d88b9b836a0eb635d5da06f10135193f0fcd1afbf3823e94ec7f9530151c245aa76e883aa278ae872ba75d10fd14509eac8b5267b1b280b74193a59"

RPROVIDES:${PN} += "transmission \
transmission-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libb64.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libdeflate.so.0 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.17 \
libpsl.so.5 \
libstdc++.so.6 \
transmission-common \
update-alternatives"

inherit rpm
