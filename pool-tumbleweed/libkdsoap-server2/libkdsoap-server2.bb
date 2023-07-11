SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the server-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap-server2-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "07dbba5cd7775b81bf76ea7d4991771a6397e37210bc83f2699f0bcfa357fbd2bae4864c4587b9f05da41f531850973584f07afb6bfd75e393260ef552400b60"

RPROVIDES:${PN} += "libkdsoap-server.so.2 \
libkdsoap-server2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap.so.2 \
libstdc++.so.6"

inherit rpm
