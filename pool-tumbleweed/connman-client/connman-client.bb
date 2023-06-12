SUMMARY = "Client script for connman"
DESCRIPTION = "Provides client interface for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-client-1.41-4.7.aarch64.rpm"
RPM_HASH = "5ee6ad813734121b1c7a2f1fa17b9e4b83ccb55a038dcc7dfd7e3cc8b3f10c9ae5711f75c1ec801cac8a6f9ff34238564de2fb0bac048642555439e9f2b2f061"

RPROVIDES:${PN} += "connman-client \
connman-client(aarch-64)"
RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
