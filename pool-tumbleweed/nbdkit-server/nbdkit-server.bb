SUMMARY = "Network Block Device server"
DESCRIPTION = "This package contains the nbdkit server with no plugins or filters."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-server-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "fcddd620404bea9c4369ec15a1a259b3074f32fff76b831d7d05285d4419aaf9011fbe0e340b71d5f50b4153789a342db207c3192ef189caa58f8a00e981aa8b"

RPROVIDES:${PN} += "nbdkit-server \
nbdkit-server(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_0)(64bit) \
libgnutls.so.30(GNUTLS_3_7_3)(64bit) \
libselinux.so.1()(64bit)"

inherit rpm
