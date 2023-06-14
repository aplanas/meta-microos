SUMMARY = "Qt 6 connectivity tools and libraries"
DESCRIPTION = "Qt 6 connectivity tools and libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "487dd5e79e31765dd93fc37ad97e9b08276e5d7f5ce6949650ba9fe5a0bc7f11a7360bcdf73ab76c48cb8fb448c61c701f063faca83c23fe1048d711469a29e6"

RPROVIDES:${PN} += "qt6-connectivity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
