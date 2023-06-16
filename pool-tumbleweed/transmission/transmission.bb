SUMMARY = "A BitTorrent client with multiple UIs"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-4.0.3-2.1.aarch64.rpm"
RPM_HASH = "b0e6a139db7ee23e7491c01b4dfa46ae2fa3f290b4c998708d0351e1434e9b7bb41ca31de11170fecbae9538af51d428bbf732734ca33ca0c589950b39d5670c"

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
