SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5DNSSD5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "de22575f5c0891bc4b8942921a5729201518b3a416a306f646ae420735adab7f50c1eaa739b06ad93e4483e320febcbc16ed186de6aa3d1d5dc6ddf078f6f94d"

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
