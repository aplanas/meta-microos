SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5DNSSD5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "ee901e42f2439e4dc7ee0b451818a7b4da8b65a1fb0ed95d4f4d77f24dbab042bcc94f5e52df351c1555f7dafc0f4e7fa82f41de25f9a8bc973d597afa7e4a88"

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
