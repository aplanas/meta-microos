SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5DNSSD5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "da40955ffc05c3181c2ec782ddd647359d0175610957058bc8203b4fb417ddc3e44c55b09ed745ede59bb7912053a9b51c42ed37a89f28e658846764a39c769a"

RPROVIDES:${PN} += "libKF5DNSSD.so.5()(64bit) \
libKF5DNSSD5 \
libKF5DNSSD5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Network5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
