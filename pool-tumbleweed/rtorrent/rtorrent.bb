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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libtorrent.so.21()(64bit) \
libxmlrpc.so.3()(64bit) \
libxmlrpc_server.so.3()(64bit) \
libxmlrpc_util.so.4()(64bit) \
shadow"

inherit rpm
