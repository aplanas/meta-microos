SUMMARY = "Qt 5 NetworkAuth Library"
DESCRIPTION = "Qt Network Authorization provides a set of APIs that enable Qt \
applications to obtain limited access to online accounts and HTTP \
services without exposing users' passwords. It supports OAuth \
versions 1 and 2."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5NetworkAuth5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "e12abe7e847b51a99e12e94081e531010f1fa3f40d32444d42b3c82b8beb9582fac8a1b6d7902a8d3e142a2f635957e2c4ef265c127dde000d656e8b2a18d911"

RPROVIDES:${PN} += "libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libQt5NetworkAuth5 \
libQt5NetworkAuth5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
