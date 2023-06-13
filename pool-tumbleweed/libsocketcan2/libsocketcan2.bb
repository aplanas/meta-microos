SUMMARY = "Library for SocketCAN"
DESCRIPTION = "This library allows you to control some basic functions in socketcan \
from userspace. A recent kernel with integrated SocketCAN (at least \
2.6.30) is needed."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12"

RPM_NAME = "libsocketcan2-0.0.12-1.6.aarch64.rpm"
RPM_HASH = "afbfc5c9591e84d5b136180a036cfc7b979e90b6be931174a75a7f7ab372251786e0fad9855d7b58847a5971c1d638e34ff6c0af250783a38f83e94612258e44"

RPROVIDES:${PN} += "libsocketcan.so.2()(64bit) \
libsocketcan2 \
libsocketcan2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
