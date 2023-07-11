SUMMARY = "Library containing simple XML-RPC Client support"
DESCRIPTION = "Library containing simple XML-RPC Client support."
LICENSE = "BSD-2-Clause"

PV = "5.107.0"

RPM_NAME = "libKF5XmlRpcClient5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "cfa336bc199b548fe1e3fcb32c8cbab9484e59bb97461718ae721aae939b6d487a9b6cc2446aaa0f260c4d095644409207a6e845e3fdbae7dc787e6e153ef637"

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
