SUMMARY = "Qt interface for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links. \
 \
This package contains a graphical user interface to transmission."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-qt-4.0.3-2.1.aarch64.rpm"
RPM_HASH = "d883a97205281bccaf83df3cd9e516d00f84a5094f387e1c595f7bbe2369fa52e9bd89d49a7950066e957b68908db372fceb2d3e03e63d5a9836c915a31a236b"

RPROVIDES:${PN} += "transmission-qt \
transmission-ui"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
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
