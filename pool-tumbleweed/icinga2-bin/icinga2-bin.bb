SUMMARY = "Icinga 2 binaries and libraries"
DESCRIPTION = "Icinga 2 is a general-purpose network monitoring application. \
This subpackage provides the binaries for Icinga 2 Core."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-bin-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "a73f232e903c022dfb680e42bee179c86fb69b870b82fbbd5b0db9525a5df731c3fe8909f0236da07062a715379a750732c056c97aeed98d596a6837feee7205"

RPROVIDES:${PN} += "icinga2-bin \
icinga2-libs \
monitoring-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-context.so.1.82.0 \
libboost-coroutine.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
systemd"

inherit rpm
