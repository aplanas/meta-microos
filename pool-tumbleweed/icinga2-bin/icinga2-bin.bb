SUMMARY = "Icinga 2 binaries and libraries"
DESCRIPTION = "Icinga 2 is a general-purpose network monitoring application. \
This subpackage provides the binaries for Icinga 2 Core."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-bin-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "1717e7037e28a381196ec1da43a880484f97581dbc74ab2a4fa8538920922a16aa2d8389c044d81e66996202d820d1cf8e5ef5789b5be8af1546a5f3dfde7630"

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
