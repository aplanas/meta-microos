SUMMARY = "Console-based BitTorrent Client"
DESCRIPTION = "rTorrent is a console-based BitTorrent client. It aims to be a \
fully-featured and efficient client with the ability to run in the \
background using screen. It supports fast-resume and session \
management."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.9.8"

RPM_NAME = "rtorrent-0.9.8-6.5.aarch64.rpm"
RPM_HASH = "9cc98aa88dc522b2fb4069f39cf679f630af78660e4f73cd73c6b5c036fd18a958d3bdcebaa9806286eb912b7d2c76cc302f08af70ad3035f7025805beaf4e23"

RPROVIDES:${PN} += "rtorrent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libtorrent.so.21 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3 \
shadow"

inherit rpm
