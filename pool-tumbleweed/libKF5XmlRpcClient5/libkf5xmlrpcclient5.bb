SUMMARY = "Library containing simple XML-RPC Client support"
DESCRIPTION = "Library containing simple XML-RPC Client support."
LICENSE = "BSD-2-Clause"

PV = "5.109.0"

RPM_NAME = "libKF5XmlRpcClient5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "46c582d6c9aec4393331a5dfb706912a0abb4e58f92f587a74a027e8c2f0520c4949da1bfc4062631d1c1ff452de51e0f87db35e2f56490c12c354aa744d0b51"

RPROVIDES:${PN} += "libKF5XmlRpcClient.so.5 \
libKF5XmlRpcClient5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
