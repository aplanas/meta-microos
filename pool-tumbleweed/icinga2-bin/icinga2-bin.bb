SUMMARY = "Icinga 2 binaries and libraries"
DESCRIPTION = "Icinga 2 is a general-purpose network monitoring application. \
This subpackage provides the binaries for Icinga 2 Core."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-bin-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "a73f232e903c022dfb680e42bee179c86fb69b870b82fbbd5b0db9525a5df731c3fe8909f0236da07062a715379a750732c056c97aeed98d596a6837feee7205"

RPROVIDES:${PN} += "icinga2-bin \
icinga2-bin(aarch-64) \
icinga2-libs \
monitoring_daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_context.so.1.82.0()(64bit) \
libboost_coroutine.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
systemd"

inherit rpm
