SUMMARY = "Icinga 2 binaries and libraries"
DESCRIPTION = "Icinga 2 is a general-purpose network monitoring application. \
This subpackage provides the binaries for Icinga 2 Core."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-bin-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "6ac9c23723189153b8d78a6db3ccc059eab1577aac58f1e20841efab9754c887f2744b82edb0110be299a4d74238fbd667e6d86e6c4505358bd24138748b4ba3"

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
