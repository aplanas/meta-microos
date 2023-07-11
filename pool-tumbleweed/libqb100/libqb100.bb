SUMMARY = "An IPC library for high performance servers"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7+20230607.06c8641"

RPM_NAME = "libqb100-2.0.7+20230607.06c8641-1.1.aarch64.rpm"
RPM_HASH = "147cc281e1b4f41aebd239e2996f4964a11a624aa5fbf3f7e4b30dbb061b8564adc1ee73af4acdef2a95d63f58da5d517d4fa902567bdc7f835e282cd4affc05"

RPROVIDES:${PN} += "libqb.so.100 \
libqb100"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
