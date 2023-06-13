SUMMARY = "Console-based BitTorrent Client"
DESCRIPTION = "rTorrent is a console-based BitTorrent client. It aims to be a \
fully-featured and efficient client with the ability to run in the \
background using screen. It supports fast-resume and session \
management."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.9.8"

RPM_NAME = "rtorrent-0.9.8-6.4.aarch64.rpm"
RPM_HASH = "11e75defe3c696a9015b7fe45133e6f5e3909fcfc81409ac6b0e7d7b7d792a1a98de473adbbd88269b821f0c7678569155869022396676a0913f6a0a4f0e0f13"

RPROVIDES:${PN} += "application() \
application(rtorrent.desktop) \
rtorrent \
rtorrent(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libtorrent.so.21()(64bit) \
libxmlrpc.so.3()(64bit) \
libxmlrpc_server.so.3()(64bit) \
libxmlrpc_util.so.4()(64bit) \
shadow"

inherit rpm
