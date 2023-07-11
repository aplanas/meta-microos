SUMMARY = "Qt interface for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links. \
 \
This package contains a graphical user interface to transmission."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-qt-4.0.3-2.2.aarch64.rpm"
RPM_HASH = "e3df2c3642bf792c3586b8ad54ed9995b3fbfe8442fb01b11e9339df87107d923007ac8c3faeb8fe171bdc2d2870df03d8bc9407eb4f56a59fac105bd3d5fcaa"

RPROVIDES:${PN} += "transmission-qt \
transmission-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
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
