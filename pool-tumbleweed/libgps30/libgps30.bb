SUMMARY = "Shared library for GPS applications"
DESCRIPTION = "This package provides the shared library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "libgps30-3.25-1.3.aarch64.rpm"
RPM_HASH = "ff74f52f8647865580bac43f245a281e62bd9643bdc4513a25a0592266adb462831122392e0a27cccf1a533c511e75759e2d793f3c43b7674a876dd35e05b0c3"

RPROVIDES:${PN} += "libgps.so.30 \
libgps30 \
libgpsdpacket.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
