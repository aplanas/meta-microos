SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutscan2-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "e0dbeda915d67be8e14a4db2fd3979e2b78d99b19eb1e43d418e839366c037a5db7b29b465b64be647cd5ff68e1a3d7ba0299df9185329af9439bcb4f3d0cd25"

RPROVIDES:${PN} += "libnutscan.so.2 \
libnutscan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7"

inherit rpm
