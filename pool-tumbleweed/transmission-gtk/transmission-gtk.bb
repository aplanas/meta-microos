SUMMARY = "GTK client for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links. \
 \
This package contains a graphical user interface to transmission."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-gtk-4.0.3-2.2.aarch64.rpm"
RPM_HASH = "42f9060be1795dd39ec4c3cfb8c64ed0548c14f2774b8d63f43ebfc760b4eb9dd92c782923aade26e3f2717e8bbb74a0f099e974dc929a3adc5660bc8ab56ba0"

RPROVIDES:${PN} += "transmission-gtk \
transmission-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
canberra-gtk-play \
ld-linux-aarch64.so.1 \
libb64.so.0 \
libc.so.6 \
libcairomm-1.16.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libdeflate.so.0 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libm.so.6 \
libminiupnpc.so.17 \
libpangomm-2.48.so.1 \
libpsl.so.5 \
libsigc-3.0.so.0 \
libstdc++.so.6 \
transmission-common \
update-alternatives"

inherit rpm
