SUMMARY = "Daemon for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-daemon-4.0.3-2.1.aarch64.rpm"
RPM_HASH = "91fb0585e4166cbea8b59f3fd53e0af329b6edd85bebb632651837df4e02f226d377ccab015b375005df4b42e4c8946282d8eabcaf786f59bda7cf7c7aa7ec57"

RPROVIDES:${PN} += "transmission-daemon"

RDEPENDS:${PN} += "/bin/sh \
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
libsystemd.so.0 \
systemd"

inherit rpm
