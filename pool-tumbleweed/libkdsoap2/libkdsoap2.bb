SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the client-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap2-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "b9513e1376840bbe5fc4f2e3eb107149f1f664567851177d10ad91852931e0e75bc0369c65d2edf405c4791cfe2eb5365b8cbbed700f07bea4ac36f21e94e269"

RPROVIDES:${PN} += "libkdsoap.so.2 \
libkdsoap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
