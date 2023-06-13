SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the server-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap-server2-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "f500afbfa9440aa21fba22131a1b6bffd39e33f10230c932c994197cf6269a5fac053aa046889ee66ec08027f38d1eedef2ffe05bf570d73785e60e3c38d8bac"

RPROVIDES:${PN} += "libkdsoap-server.so.2()(64bit) \
libkdsoap-server2 \
libkdsoap-server2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkdsoap.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
