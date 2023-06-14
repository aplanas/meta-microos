SUMMARY = "Library containing simple XML-RPC Client support"
DESCRIPTION = "Library containing simple XML-RPC Client support."
LICENSE = "BSD-2-Clause"

PV = "5.106.0"

RPM_NAME = "libKF5XmlRpcClient5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c617e4d8f6522b303deb2b7ff6f3c7877d6b3d4c49ab0c5351228c532ffccc4f69de9b71870ffa39bf9aaf852011f56c495d1baee02b9f80fb19f273c1f9f6a0"

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
