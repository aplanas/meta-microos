SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutclient2-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "474b392e7aff66e3a49c36e612c60ec782ce400cde6219fdb13e2a2e2aac19dd37035903a6eaafb7813c64b9cf76562b052406ef1523aa68d0b88df0fe63dcbe"

RPROVIDES:${PN} += "libnutclient.so.2 \
libnutclient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
