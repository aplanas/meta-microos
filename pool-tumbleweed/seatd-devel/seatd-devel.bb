SUMMARY = "Development files for seatd"
DESCRIPTION = "Development files for seatd."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "seatd-devel-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "557541a181a7e1277d21586f64ff8d8f1bd180540baea1c05e703121239472eba5c86ed7aeda0739e00f8999c0ac99c2ecb619c15123b29c7e08342641f3096e"

RPROVIDES:${PN} += "pkgconfig-libseat \
seatd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseat1 \
pkgconfig-libsystemd"

inherit rpm
