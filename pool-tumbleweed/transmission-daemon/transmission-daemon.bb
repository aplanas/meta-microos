SUMMARY = "Daemon for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-daemon-4.0.3-2.2.aarch64.rpm"
RPM_HASH = "8fdaf07a286fd5c60511cc99e4b6b467661c79819b6f80d0859ab6a0a6adcdf29d9dd18dc98df583d77b4d3afede19b937c0ac459601374092599f26deaa5c18"

RPROVIDES:${PN} += "transmission-daemon"

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
libsystemd.so.0 \
systemd"

inherit rpm
