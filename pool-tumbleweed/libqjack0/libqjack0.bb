SUMMARY = "Connect to the Jack Sound Server with Qt"
DESCRIPTION = "QJack makes you connect with the Jack soundserver system with Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+20170112"

RPM_NAME = "libqjack0-0.0+20170112-3.23.aarch64.rpm"
RPM_HASH = "1e3eaf6f5718218a128cd1f89fbcd9758aa31f48e84808df9e2056c9d1b4c1bcfc007a3887fc3118d166ba09fec0dc36637c8edcd23b284b0e3c42588811e5f9"

RPROVIDES:${PN} += "libqjack.so.0 \
libqjack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
