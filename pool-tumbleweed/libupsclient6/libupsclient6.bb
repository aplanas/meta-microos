SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libupsclient6-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "2a65f8ed5f62225af1a821798d4e4ba842fada4b5d569bdbaba1bf64eefd5a27c159578ee442df175244562688b20c7fb645593e5a2b5e72184fac8417d949d0"

RPROVIDES:${PN} += "libupsclient.so.6 \
libupsclient6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
