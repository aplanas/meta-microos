SUMMARY = "C++ library for filezilla"
DESCRIPTION = "libfilezilla is C++ library, offering some basic functionality to \
build high-performing, platform-independent programs. libfilezilla is \
needed for filezilla (an FTP client and server) to build. Some of the \
highlights include: \
 \
* A typesafe, multi-threaded event system. \
* Timers for periodic events. \
* A datetime class that not only tracks timestamp but also their accuracy, \
  which simplifies dealing with timestamps originating from different sources. \
* Simple process handling for spawning child processes with redirected I/O."
LICENSE = "GPL-2.0-or-later"

PV = "0.42.2"

RPM_NAME = "libfilezilla36-0.42.2-1.1.aarch64.rpm"
RPM_HASH = "fcd5b599fd9277bca27bcefaa181629793a64215e6b5c56dbc9597c9df9a5fce961f0084d510558b91f62346003edb9bf2c799da48ad3f3e2fd50b011641cede"

RPROVIDES:${PN} += "libfilezilla \
libfilezilla.so.36()(64bit) \
libfilezilla36 \
libfilezilla36(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_0)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgnutls.so.30(GNUTLS_3_7_0)(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
