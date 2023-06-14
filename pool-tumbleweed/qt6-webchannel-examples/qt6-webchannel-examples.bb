SUMMARY = "Examples for the qt6-webchannel modules"
DESCRIPTION = "Examples for the qt6-webchannel modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webchannel-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dada79755904f49d7ea67e2213adc459e6f7a19e7285f0209822b9fa6b97787b92347a202053ddf3b008aabb5525058130fb0114679b5abaaeb5ebb2bd58d054"

RPROVIDES:${PN} += "qt6-webchannel-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebChannel.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
