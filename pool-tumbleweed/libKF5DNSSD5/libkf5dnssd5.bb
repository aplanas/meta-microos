SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5DNSSD5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "b7913481ad66f58442097da3c7289449dfd6acf80e633f813564ffa20cd64e6c5be5412472107185f3dced67860f21732c3c29509c2376558d39fc2e1d8f861e"

RPROVIDES:${PN} += "libKF5DNSSD.so.5 \
libKF5DNSSD5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
