SUMMARY = "Library containing simple XML-RPC Client support"
DESCRIPTION = "Library containing simple XML-RPC Client support."
LICENSE = "BSD-2-Clause"

PV = "5.108.0"

RPM_NAME = "libKF5XmlRpcClient5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "44621535d503fbe9dfd05c27048c9da321187ddd81f7d202a99328dce4a3ba9377e31b7c32fadd8c3e1896c61876a4a5f0ab1bd06bb4c61fe1decae6211eef7b"

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
