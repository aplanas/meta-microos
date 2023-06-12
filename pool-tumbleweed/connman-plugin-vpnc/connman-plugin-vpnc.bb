SUMMARY = "VPNC plugin for connman"
DESCRIPTION = "Provides VPNC support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-vpnc-1.41-4.7.aarch64.rpm"
RPM_HASH = "1ab907e64d7b17535eb85ec718d2cdab2ba08a42c63f5b563741e5a4393d4108c3b0c1de14fc76c9966aad575fc0c2f5c9c77f73db165677ad5f418196a331d1"

RPROVIDES:${PN} += "connman-plugin-vpnc \
connman-plugin-vpnc(aarch-64)"
RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
vpnc"

inherit rpm
